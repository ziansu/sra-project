public boolean isUserEnabled(final java.lang.String userName) {
    net.sf.acegisecurity.UserDetails userDetails = authenticationDao.loadUserByUsername(userName);
    return (userDetails != null) && (userDetails.isEnabled());
}