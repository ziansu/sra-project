private void setAdmin(org.apache.ftpserver.ftplet.User user) {
    ddf.security.Subject subject = ((ddf.catalog.core.ftp.user.FtpUser) (user)).getSubject();
    if ((org.apache.commons.lang3.StringUtils.isEmpty(this.admin)) && (subject.hasRole("admin"))) {
        this.admin = user.getName();
    }
}