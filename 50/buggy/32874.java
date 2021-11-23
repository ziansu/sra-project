public void setPassword(java.lang.String password) {
    this.password = com.polito.mad17.madmax.entities.User.encryptPassword(password);
}