public java.lang.String toString() {
    java.lang.String s = (bias) + ": ";
    for (int i = 0; i < (weights.size()); i++) {
        s += (weights.get(i).toString()) + ", ";
    }
    return s;
}