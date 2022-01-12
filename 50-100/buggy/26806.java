public java.lang.String writePTN(java.lang.String in, int turn) {
    java.lang.String out = "";
    if (first) {
        out += ((turn + 1) + ". ") + in;
    }else {
        out += (" " + in) + "%n";
    }
    first = (first) ? false : true;
    return out;
}