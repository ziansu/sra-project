private boolean validateEnglishLetter(final char value) {
    return (supportsEnglish) == (isEnglishCharacter(value));
}