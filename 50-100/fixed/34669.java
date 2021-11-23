public org.opentides.bean.user.BaseUser cloneUserProfile() {
    org.opentides.bean.user.BaseUser clone = new org.opentides.bean.user.BaseUser();
    clone.firstName = firstName;
    clone.lastName = lastName;
    clone.middleName = middleName;
    clone.emailAddress = emailAddress;
    clone.office = office;
    clone.language = language;
    clone.lastLogin = lastLogin;
    clone.credential = credential;
    clone.lastFailedIP = lastFailedIP;
    clone.lastLoginIP = lastLoginIP;
    clone.prevLoginIP = prevLoginIP;
    clone.totalLoginCount = totalLoginCount;
    clone.failedLoginCount = failedLoginCount;
    return clone;
}