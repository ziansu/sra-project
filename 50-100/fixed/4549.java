private static java.lang.String hash(long input, java.lang.String alphabet) {
    java.lang.String hash = "";
    int alphabetLen = alphabet.length();
    do {
        int index = ((int) (input % alphabetLen));
        if ((index >= 0) && (index < (alphabet.length()))) {
            hash = (alphabet.charAt(index)) + hash;
        }
        input /= alphabetLen;
    } while (input > 0 );
    return hash;
}