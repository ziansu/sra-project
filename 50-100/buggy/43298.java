public boolean isZero() {
    for (int i = 0; i < (number.length()); i++) {
        char c = number.charAt(i);
        if (c != '0')
            return false;
        
    }
    return true;
}