private static char getRandomChar() {
    float letterFactor = (evolv.io.NameGenerator.RANDOM.nextFloat()) * 100;
    int letterChoice = 0;
    while (letterFactor > 0) {
        letterFactor -= evolv.io.NameGenerator.LETTER_FREQUENCIES[letterChoice];
        letterChoice++;
    } 
    return ((char) ((letterChoice - 1) + 'a'));
}