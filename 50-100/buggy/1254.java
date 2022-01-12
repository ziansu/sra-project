public int numberOfTaxa(java.lang.String tree) {
    int charCount = 0;
    char temp;
    for (int i = 0; i < (tree.length()); i++) {
        temp = tree.charAt(i);
        if (temp == ',')
            charCount++;
        
    }
    return charCount;
}