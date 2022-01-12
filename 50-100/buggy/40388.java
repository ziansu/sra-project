public java.lang.String toString() {
    java.lang.String s = (bias) + ": ";
    for (int i = 0; i < (weights.size()); i++) {
        if ((i % 10) == 0)
            s += "\n";
        
        s += (weights.get(i)) + ", ";
    }
    return s;
}