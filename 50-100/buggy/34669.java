public org.opentides.bean.user.BaseUser cloneUserProfile() {
    org.opentides.bean.user.BaseUser clone = new org.opentides.bean.user.BaseUser();
    clone.firstName = this.firstName;
    clone.lastName = this.lastName;
    clone.middleName = this.middleName;
    clone.emailAddress = this.emailAddress;
    clone.office = this.office;
    clone.language = this.language;
    clone.lastLogin = this.lastLogin;
    clone.credential = this.credential;
    clone.lastFailedIP = this.lastFailedIP;
    clone.lastLoginIP = this.lastLoginIP;
    clone.prevLoginIP = this.prevLoginIP;
    clone.totalLoginCount = this.totalLoginCount;
    clone.failedLoginCount = this.failedLoginCount;
    return clone;
}