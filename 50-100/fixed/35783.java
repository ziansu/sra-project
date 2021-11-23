public java.lang.String toString() {
    java.lang.String temp = "[";
    for (int n = 0; n < ((sizeOfList) - 1); ++n) {
        temp = (temp + (listItems[n])) + ", ";
    }
    if ((sizeOfList) > 0) {
        temp = (temp + (listItems[((sizeOfList) - 1)])) + "]";
    }else {
        temp = temp + "]";
    }
    return temp;
}