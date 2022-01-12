private void finish(int length1, int length2) {
    assert (myIndex1) <= length1;
    assert (myIndex2) <= length2;
    if ((length1 != (myIndex1)) || (length2 != (myIndex2))) {
        addChange(myIndex1, myIndex2, length1, length2);
    }
}