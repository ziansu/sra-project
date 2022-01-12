public static char encodedCycleOfProcessingData(char character, int firstSymbolInASCII, int alphabetSize, int key) {
    java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
    int asciiCodeOfCharacter = ((character - firstSymbolInASCII) + key) % alphabetSize;
    int myCodeOfCharacter = asciiCodeOfCharacter + firstSymbolInASCII;
    if (asciiCodeOfCharacter >= 0) {
        stringBuilder.appendCodePoint(myCodeOfCharacter);
    }else {
        stringBuilder.appendCodePoint((myCodeOfCharacter + alphabetSize));
    }
    return stringBuilder.charAt(0);
}