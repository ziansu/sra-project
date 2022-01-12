public java.lang.String getTokensAsString() {
    java.lang.StringBuilder s = new java.lang.StringBuilder();
    for (int i = 0; i < (tokens.size()); i++) {
        s.append(tokens.get(i));
        if (i < ((tokens.size()) - 1)) {
            s.append(" ");
        }
    }
    return s.toString();
}