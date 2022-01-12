public static java.lang.String decrypt(java.lang.String hexCipherText) {
    if ((com.easytoolsoft.easyreport.data.common.helper.AESHelper.dcipher) == null) {
        return hexCipherText;
    }
    try {
        java.lang.String plaintext = new java.lang.String(com.easytoolsoft.easyreport.data.common.helper.AESHelper.dcipher.doFinal(com.easytoolsoft.easyreport.data.common.helper.AESHelper.hexToByte(hexCipherText)), "UTF-8");
        return plaintext;
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        return null;
    }
}