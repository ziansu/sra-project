public static void printUntilW(java.lang.String word) {
    int i = 0;
    while (i < (word.length())) {
        char character = word.charAt(i);
        if (character == 'w') {
            break;
        }
        java.lang.System.out.println(character);
        i++;
    } 
}