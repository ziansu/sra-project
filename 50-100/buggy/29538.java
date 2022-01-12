private int countChar(java.lang.String str, char c) {
    int counter = 0;
    for (int i = 0; i <= (str.length()); i++) {
        if ((str.charAt(i)) == c)
            counter++;
        
    }
    return counter;
}