@java.lang.Override
public java.lang.String encrypt(java.lang.String key, java.lang.String message) {
    java.lang.String translated = null;
    int encryptionKey = java.lang.Integer.parseInt(key);
    char[] ciphertext = new char[encryptionKey];
    for (int col = 0; col < encryptionKey; col++) {
        int pointer = col;
        while (pointer < (message.length())) {
            ciphertext[col] += message.charAt(pointer);
            pointer += encryptionKey;
        } 
    }
    translated = new java.lang.String(ciphertext);
    return translated;
}