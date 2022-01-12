public static java.lang.String superDecrypt(java.lang.String start) {
    if ((start.length()) < 1)
        return start;
    
    for (int i = 0; i < 3; i++) {
        start = Encryption.keyDecrypt(7, start);
        start = Encryption.descramble(start, 7);
    }
    return start;
}