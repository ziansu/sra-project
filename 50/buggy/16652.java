public static java.lang.String rolling_XOR(java.lang.String key, java.lang.String plaintext) {
    java.lang.String temp = key;
    while ((key.length) != (plaintext.length)) {
        temp += key;
    } 
    return temp ^ plaintext;
}