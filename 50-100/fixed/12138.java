public java.lang.String toString() {
    java.lang.String str = "";
    for (int i = 0; i < (data.length); i++) {
        str = (((str + "\n") + i) + ": ") + (data[i]);
    }
    return str;
}