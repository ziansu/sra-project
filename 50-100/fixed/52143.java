public java.lang.String toString() {
    java.lang.String s = ((("Edge " + (start.getName())) + " ") + (end.getName())) + ".";
    if ((weight) != 0) {
        s += (" weight: " + (weight)) + ".";
    }
    return s;
}