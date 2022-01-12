public void setPassword(java.lang.String password) {
    if (edu.mum.onlinetest.utils.Based64Util.isValidMD5(password)) {
        password = edu.mum.onlinetest.utils.Based64Util.md5(password);
    }
    this.password = password;
}