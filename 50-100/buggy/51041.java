public java.lang.String printH(LNodes<T> start, java.lang.String str, int index) {
    if (start.hasNext()) {
        str += ("" + (start.getValue())) + " ";
        printH(start.getNext(), str, index);
    }
    return str + "]";
}