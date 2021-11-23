public static void printUntilW(java.lang.String word) {
    int i = 0;
    while (i < (word.length())) {
        char character = word.toLowerCase().charAt(i);
        if (character != 'w') {
            java.lang.System.out.println(word.charAt(i));
            i++;
        }else {
            break;
        }
    } 
}