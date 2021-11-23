public java.lang.String toString() {
    java.lang.String str = "";
    for (int i = 0; i < ((bufferpool.length) - 1); i++) {
        str += bufferpool[i].toString();
        str += "\n";
    }
    return str;
}