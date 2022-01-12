public static java.lang.String stripExtension(java.lang.String s) {
    if ((s.contains(".")) == false) {
        return s;
    }
    try {
        return s.substring(0, s.lastIndexOf("."));
    } catch (java.lang.StringIndexOutOfBoundsException e) {
        e.printStackTrace();
    }
    return s;
}