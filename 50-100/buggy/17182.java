private java.lang.String getString(java.util.ArrayList<java.lang.String> sentence) {
    java.lang.String s = sentence.toString();
    s = s.substring(1, ((s.length()) - 1));
    s = s.replaceAll(",", "");
    return s;
}