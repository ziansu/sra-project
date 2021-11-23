public java.lang.String writePTN(java.lang.String in, int turn) {
    java.lang.String out = "";
    if (first) {
        out += (("%n" + (turn + 1)) + ". ") + in;
    }else {
        out += " " + in;
    }
    first = (first) ? false : true;
    return out;
}