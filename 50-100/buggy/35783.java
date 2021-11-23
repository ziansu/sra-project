public java.lang.String toString() {
    java.lang.String temp = "[";
    for (int n = 0; n < ((sizeOfList) - 1); ++n) {
        temp = (temp + (listItems[n])) + ", ";
    }
    temp = (temp + (listItems[((sizeOfList) - 1)])) + "]";
    return temp;
}