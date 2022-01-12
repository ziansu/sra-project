public boolean equals(int[] data) {
    if ((data.length) != (length())) {
        return false;
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