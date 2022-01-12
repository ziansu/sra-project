static java.lang.CharSequence removeTailR(java.lang.CharSequence s) {
    if ((s.length()) == 0)
        return s;
    
    if ((s.charAt(((s.length()) - 1))) == '\r') {
        s = s.subSequence(0, ((s.length()) - 1));
    }
    return s;
}