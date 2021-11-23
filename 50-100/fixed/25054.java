public int getStringHeight(final java.lang.String text) {
    int lines = 1;
    for (char c : text.toCharArray())
        if (c == '\n')
            lines++;
        
    
    return (((fontHeight) - (charOffset)) / 2) * lines;
}