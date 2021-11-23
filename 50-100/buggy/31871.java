private void setAdmin(org.apache.ftpserver.ftplet.User user) {
    ddf.security.Subject subject = ((ddf.catalog.core.ftp.user.FtpUser) (user)).getSubject();
    if ((subject.hasRole("admin")) && (org.apache.commons.lang3.StringUtils.isEmpty(this.admin))) {
        this.admin = user.getName();
    }
}