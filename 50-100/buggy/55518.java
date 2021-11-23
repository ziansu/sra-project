public boolean equals(int[] data) {
    if ((data.length) != (length())) {
        throw new java.lang.IndexOutOfBoundsException("data length != list length");
    }
    List.Node tmpCurrent = current;
    moveFront();
    for (int i : data) {
        if (i != (get())) {
            current = tmpCurrent;
            return false;
        }
        moveNext();
    }
    current = tmpCurrent;
    return true;
}