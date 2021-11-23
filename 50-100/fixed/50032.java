private void createApplicationMainUserIfDoesntExist() {
    try {
        loggedInUser = ((com.matteoveroni.mydiary.user.ApplicationUser) (databaseManager.read(com.matteoveroni.mydiary.user.ApplicationUser.class, null, ElementOnWhichOperate.FIRST)));
        if ((loggedInUser) == null) {
            loggedInUser = new com.matteoveroni.mydiary.user.ApplicationUser();
            loggedInUser.setName("matteo");
            loggedInUser.setPassword("pass");
            loggedInUser.setAge(28);
            databaseManager.write(loggedInUser);
        }
    } catch (java.lang.Exception ex) {
        throw new java.lang.RuntimeException(ex);
    }
}