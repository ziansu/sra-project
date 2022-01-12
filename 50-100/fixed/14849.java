public java.lang.String getRestOfUrl() {
    java.lang.StringBuilder buf = new java.lang.StringBuilder();
    for (int i = index; i < (tokens.length); i++) {
        if ((buf.length()) > 0)
            buf.append('/');
        
        buf.append(tokens[i]);
    }
    return buf.toString();
}