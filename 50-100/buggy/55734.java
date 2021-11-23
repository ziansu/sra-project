private java.lang.String capitalize(java.lang.String s) {
    if ((s == null) || ((s.length()) == 0)) {
        return "";
    }
    char first = s.charAt(0);
    if (java.lang.Character.isUpperCase(first)) {
        return s;
    }else {
        return (java.lang.Character.toUpperCase(first)) + (s.substring(1));
    }
}