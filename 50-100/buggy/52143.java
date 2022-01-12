public java.lang.String toString() {
    java.lang.String s = ((("Edge " + (start.name)) + " ") + (end.name)) + ".";
    if ((weight) != 0) {
        s += (" weight: " + (weight)) + ".";
    }
    return s;
}