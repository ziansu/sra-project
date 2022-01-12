public java.lang.String toString() {
    java.lang.String str = "\n";
    for (int x = 0; x < (size()); x++) {
        str += (get(x).toString()) + '\n';
    }
    return str;
}