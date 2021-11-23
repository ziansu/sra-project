public java.lang.String toString() {
    java.lang.StringBuilder returnStr = new java.lang.StringBuilder("[");
    for (int i = 0; i < (size); i++) {
        returnStr.append(get(i));
        if (i != ((size) - 1)) {
            returnStr.append(",");
        }
    }
    returnStr.append("]");
    return returnStr.toString();
}