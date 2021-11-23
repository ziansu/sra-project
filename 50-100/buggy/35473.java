private boolean match(int index, java.lang.String token) {
    if ((index + (token.length())) >= (html.length()))
        return false;
    
    for (int i = 0; i < (token.length()); i++) {
        if ((html.charAt((index + i))) != (token.charAt(i)))
            return false;
        
    }
    return true;
}