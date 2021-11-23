public java.lang.String toString() {
    java.lang.StringBuffer buf = new java.lang.StringBuffer();
    buf.append(("Weglänge: " + (laenge())));
    buf.append("\n");
    int count = 1;
    for (com.enpasos.navi.Stadt s : staedteAufWeg) {
        buf.append(s.toString());
        if ((count++) < (staedteAufWeg.size()))
            buf.append(" > ");
        
    }
    return buf.toString();
}