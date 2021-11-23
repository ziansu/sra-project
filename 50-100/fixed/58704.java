private static java.lang.String randomText() {
    java.lang.StringBuilder text = new java.lang.StringBuilder();
    for (int i = 0; i < (Model.Tools.RandomFileGenerator.TEXT_SIZE); i++) {
        char A = 'A';
        int rand = ((int) ((java.lang.Math.random()) * 26));
        char newCharacter = ((char) (A + rand));
        text.append(newCharacter);
    }
    return text.toString();
}