private java.lang.String toInitialLowerCase(java.lang.String s) {
    if (((s.length()) < 1) || (java.lang.Character.isLowerCase(s.charAt(0))))
        return s;
    
    java.lang.StringBuffer buf = new java.lang.StringBuffer(s);
    buf.setCharAt(0, java.lang.Character.toLowerCase(buf.charAt(0)));
    return buf.toString();
}