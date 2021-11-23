private java.lang.String readpreLine() throws java.io.IOException {
    java.lang.String l;
    do {
        l = in.readLine();
        if (l == null) {
            return null;
        }
        if (l.contains("<pre>")) {
            pre = true;
            l = in.readLine();
        }
        if (l == null) {
            return null;
        }
        if (l.contains("</pre>")) {
            pre = false;
        }
    } while (!(pre) );
    return l;
}