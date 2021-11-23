public java.lang.Boolean validation(java.lang.String phoneNumber, java.lang.String passWord) {
    helperEntity = discardDAO.getHelper(phoneNumber);
    cipherText = helperEntity.getPassword();
    plainText = com.sbu.service.impl.Encryptor.decrypt(cipherText);
    if (passWord.equals(plainText)) {
        return true;
    }else {
        return false;
    }
}