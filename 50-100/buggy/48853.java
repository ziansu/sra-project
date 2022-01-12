public java.lang.String reportForTex() {
    java.lang.String s = "";
    int i = 0;
    for (nouth.les.Ex e : exList) {
        if (!(e.silent)) {
            s += e.reportForTex();
            if (i != ((this.size()) - 1)) {
                s += "\\\\\\cdot ";
            }
            i++;
        }
    }
    return s;
}