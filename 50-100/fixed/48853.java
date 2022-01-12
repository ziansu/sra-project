public java.lang.String reportForTex() {
    java.lang.String s = "";
    int i = 0;
    for (nouth.les.Ex e : exList) {
        if (!(e.silent)) {
            if (i != 0) {
                s += "\\\\\\cdot ";
            }
            s += e.reportForTex();
            i++;
        }
    }
    return s;
}