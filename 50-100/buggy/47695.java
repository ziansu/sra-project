private java.lang.String speedsPrintOut() {
    java.lang.String s = "";
    int i = 0;
    for (int[] l : carSpeeds) {
        s += ("Race " + (java.lang.Integer.toString(i))) + ":\n";
        for (int sp : l) {
            s += ("Car Speed: " + (java.lang.Integer.toString(sp))) + "  ";
        }
        i++;
        s += "\n";
    }
    return s;
}