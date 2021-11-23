public java.lang.String[] generateMultiplePasswords(java.lang.String specialCharInput, int min, int max, int numberOfPasswords) {
    java.lang.String[] passwordStringArray = new java.lang.String[numberOfPasswords];
    for (int i = 0; i < numberOfPasswords; i++) {
        passwordStringArray[i] = generatePassword(specialCharInput, min, max);
    }
    return passwordStringArray;
}