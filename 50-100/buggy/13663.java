private java.lang.String sletPunktummer(java.lang.String s) {
    java.lang.String s1 = s.substring(0, s.indexOf("."));
    java.lang.String s2 = s.substring(s.indexOf("."), s.lastIndexOf("."));
    java.lang.String s3 = s.substring(s.lastIndexOf("."), s.length());
    return s = s1 + s3;
}