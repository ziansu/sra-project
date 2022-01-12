public java.lang.String kontrol(java.lang.String s) {
    if (s.contains(",")) {
        s = s.replaceAll(",", ".");
        if ((s.indexOf(".")) != (s.lastIndexOf("."))) {
            s = sletPunktummer(s);
        }
    }
    return s;
}