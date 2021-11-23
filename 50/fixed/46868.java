public java.lang.String label() {
    java.lang.String lbl = instruction.split("(")[0];
    lbl = lbl.split(")")[0];
    return lbl;
}