public java.lang.String[] generateMultiplePasswords(int numberOfPasswords) {
    java.lang.String[] passwordStringArray = new java.lang.String[numberOfPasswords];
    for (int i = 0; i < numberOfPasswords; i++) {
        passwordStringArray[i] = generatePassword();
    }
    return passwordStringArray;
}