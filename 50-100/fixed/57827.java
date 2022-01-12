private static void encryptedValue(javax.crypto.Cipher cipher) {
    java.lang.String firstPassword = org.wso2.ciphertool.utils.Utils.getValueFromConsole("Enter Plain Text Value : ", true);
    java.lang.String secondPassword = org.wso2.ciphertool.utils.Utils.getValueFromConsole("Please Enter Value Again : ", true);
    if ((!(firstPassword.isEmpty())) && (firstPassword.equals(secondPassword))) {
        java.lang.String encryptedText = org.wso2.ciphertool.CipherTool.doEncryption(cipher, firstPassword);
        java.lang.System.out.println((("\nEncrypted value is : \n" + encryptedText) + "\n"));
    }else {
        throw new org.wso2.ciphertool.exception.CipherToolException("Error : Password does not match");
    }
}