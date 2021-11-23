public boolean isUserEnabled(final java.lang.String userName) {
    net.sf.acegisecurity.UserDetails userDetails = authenticationDao.loadUserByUsername(userName);
    if (userDetails == null) {
        java.lang.System.out.println("Person doesn't exist");
        return false;
    }
    return userDetails.isEnabled();
}