public java.lang.String toString() {
    java.lang.String res = "";
    for (parsers.Value val : values()) {
        res += val + "\t";
    }
    return res;
}