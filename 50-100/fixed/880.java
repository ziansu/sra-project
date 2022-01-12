private boolean hasTimezoneField() {
    boolean literal = false;
    for (int i = (this.pattern.length()) - 1; i >= 0; i--) {
        char c = this.pattern.charAt(i);
        if (c == '\'') {
            literal = !literal;
        }else
            if ((!literal) && (c == 'z')) {
                return true;
            }
        
    }
    return false;
}