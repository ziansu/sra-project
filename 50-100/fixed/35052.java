public void setInfo(com.luxoft.wheretogo.models.UserInfo user) {
    this.firstName = user.getFirstName();
    this.lastName = user.getLastName();
    this.birthday = user.getBirthday();
    this.phoneNumber = user.getPhoneNumber();
    this.description = user.getDescription();
    setPicture(user.getPicture());
}