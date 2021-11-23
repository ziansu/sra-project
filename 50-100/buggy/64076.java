private void formatPhoneNum() {
    this.phoneNum = (((("(" + (this.phoneNum.substring(0, 3))) + ") ") + (this.phoneNum.substring(3, 6))) + " ") + (this.phoneNum.substring(6));
}