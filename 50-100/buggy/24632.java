public static java.lang.String stripExtension(java.lang.String s) {
    try {
        return s.substring(0, s.lastIndexOf("."));
    } catch (java.lang.StringIndexOutOfBoundsException e) {
        e.printStackTrace();
        java.lang.System.err.println((s + " : STRING"));
    }
    return s;
}