public java.lang.String encryptData(java.lang.String text) {
    java.lang.String encryptedTxt = "";
    try {
        encryptedTxt = com.scottyab.aescrypt.AESCrypt.encrypt(psw, text);
        android.util.Log.d(com.group.mydea.CryptData.TAG, ((("-------------------encryptData-----------\nText:" + text) + "\nencryptedMsg:") + encryptedTxt));
    } catch (java.security.GeneralSecurityException e) {
        android.util.Log.d(com.group.mydea.CryptData.TAG, ("Error on encrypting data: " + e));
    }
    return encryptedTxt;
}