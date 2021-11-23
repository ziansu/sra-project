private void fulfillProfile(org.test.logic.Profile profile, java.lang.String userEmail) {
    org.test.dbservice.UsersEntity user = new org.test.dbservice.UserDaoImpl().getUserByEmail(userEmail);
    profile = fillProfile(profile, user);
}