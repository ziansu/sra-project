public void setUser(myattendance.BE.User user) {
    this.user = user;
    attendenceChecks();
    updateView();
}