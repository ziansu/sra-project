private static java.lang.String hash(long input, java.lang.String alphabet) {
    java.lang.String hash = "";
    int alphabetLen = alphabet.length();
    do {
        hash = (alphabet.charAt(((int) (input % alphabetLen)))) + hash;
        input /= alphabetLen;
    } while (input > 0 );
    return hash;
}