private java.lang.String cleanPointBracket(java.lang.String str) {
    java.lang.StringBuffer sb = new java.lang.StringBuffer();
    int count = 0;
    for (char c : str.toCharArray()) {
        if ('<' == c)
            ++count;
        
        if ('>' == c)
            --count;
        
        if (count == 0)
            sb.append(c);
        
    }
    return sb.toString();
}