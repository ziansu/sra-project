int lineSize(java.lang.String line) {
    char[] chars = line.toCharArray();
    int size = 0;
    for (int i = 0; i < (chars.length); i++) {
        if (!(isSpace(chars[i])))
            size++;
        
    }
    return size;
}