public void encrypt(java.lang.String word) {
    char[] beforeEncrypt = word.toCharArray();
    for (int i = 0; i < (beforeEncrypt.length); i++) {
        for (int j = 1; j < (abc.length); j++) {
            if ((beforeEncrypt[i]) == (abc[j])) {
                encrypt.add((j << 4));
            }
        }
    }
}