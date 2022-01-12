public java.lang.String kontrol(java.lang.String s) {
    if (s.contains(",")) {
        s = s.replaceAll(",", ".");
        if ((s.indexOf(".")) < (s.lastIndexOf("."))) {
            sletPunktummer(s);
        }
    }
    return s;
}