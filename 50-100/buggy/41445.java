private java.lang.String calc(java.lang.String input) {
    char[] characters = input.toCharArray();
    for (int i = 0; i < (characters.lemgth); i++) {
        char c = characters[i];
        int ascii = ((int) (c));
        ascii++;
        characters[i] = ((char) (ascii));
    }
    java.lang.String calcName = new java.lang.String(characters);
    return calcName;
}