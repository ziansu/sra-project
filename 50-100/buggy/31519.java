public static java.lang.String keywordCipher(java.lang.String keyword, java.lang.String text) {
    int[] cipherNumbers = cam.cipher.Ciphers.inputToPlaintext(text);
    java.lang.String enciphered = "";
    for (int i = 0; i < (cipherNumbers.length); i++) {
        enciphered = enciphered + (keyword.charAt((((cipherNumbers[i]) + 25) % 26)));
    }
    return enciphered;
}