public java.lang.String toString() {
    java.lang.StringBuffer buf = new java.lang.StringBuffer();
    buf.append(("Weglänge: " + (laenge())));
    buf.append("\n");
    for (com.enpasos.navi.Stadt s : staedteAufWeg) {
        buf.append(s.toString());
        buf.append(" > ");
    }
    return buf.toString();
}