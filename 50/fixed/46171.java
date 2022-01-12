public void updateValues(java.lang.String emailAddress, java.lang.String displayName, java.lang.String homeAddress, com.nutsandbolts.splash.Model.UserType userType) {
    this.emailAddress = emailAddress;
    this.displayName = displayName;
    this.homeAddress = homeAddress;
    this.userType = userType;
    writeToDatabase();
}