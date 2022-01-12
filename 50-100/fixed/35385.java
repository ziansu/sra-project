public java.lang.String toString() {
    java.lang.String s = "";
    for (int h = 0; h < (height); h++) {
        s += "[";
        for (int w = 0; w < (width); w++) {
            s += (values[h][w]) + "\t";
        }
        s += "]\n";
    }
    return s;
}