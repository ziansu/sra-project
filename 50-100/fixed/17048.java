private java.lang.String generateRandomString() {
    java.lang.StringBuilder randStr = new java.lang.StringBuilder();
    for (int i = 0; i < (com.mesta.models.Token.RANDOM_STRING_LENGTH); i++) {
        int number = getRandomNumber();
        char ch = com.mesta.models.Token.CHAR_LIST.charAt(number);
        randStr.append(ch);
    }
    return randStr.toString();
}