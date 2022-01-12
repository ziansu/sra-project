public java.lang.String toString() {
    java.lang.String s = "[";
    for (int i = 0; i < ((size) - 1); i++) {
        s += (elements[i]) + ", ";
    }
    if ((size) > 0)
        s += elements[((size) - 1)];
    
    s += "]";
    return s;
}