public void updateValues(java.lang.String emailAddress, java.lang.String displayName, java.lang.String homeAddress, com.nutsandbolts.splash.Model.UserType userType) {
    setEmailAddress(emailAddress);
    setDisplayName(displayName);
    setHomeAddress(homeAddress);
    setUserType(userType);
    writeToDatabase();
}