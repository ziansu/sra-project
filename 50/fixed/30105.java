public void setPassword(java.lang.String password) {
    this.password = password;
    if ((encryptionService) != null) {
        this.password = encryptionService.decryptValue(password);
    }
    init();
}