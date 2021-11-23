public static java.lang.String setLetters(java.lang.String fullName) {
    java.lang.String[] names = fullName.split(" ");
    java.lang.String letters = "";
    for (int i = 0; i < (names.length); i++) {
        if (i == 2)
            break;
        
        letters += names[i].charAt(0);
    }
    return letters;
}