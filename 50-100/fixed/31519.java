public static java.lang.String keywordCipher(java.lang.String keyword, int[] cipherNumbers) {
    java.lang.String enciphered = "";
    for (int i = 0; i < (cipherNumbers.length); i++) {
        enciphered = enciphered + (keyword.charAt((((cipherNumbers[i]) + 25) % 26)));
    }
    return enciphered;
}