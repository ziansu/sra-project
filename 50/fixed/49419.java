public java.lang.String toString() {
    java.lang.StringBuilder b = new java.lang.StringBuilder();
    for (parsers.Value val : values()) {
        b.append((val + "\t"));
    }
    return b.toString();
}