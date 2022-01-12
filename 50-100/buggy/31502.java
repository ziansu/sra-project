public java.lang.String toString() {
    java.lang.String toString = "";
    for (int i = 0; i < ((size) - 1); i++) {
        toString += (array[i].toString()) + ",";
    }
    return toString += array[((size) - 1)];
}