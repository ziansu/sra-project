public float getLength(java.lang.String string) {
    float width = 0;
    for (char c : string.toCharArray())
        width += widths[c];
    
    return width * (scale);
}