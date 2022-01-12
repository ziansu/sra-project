public java.lang.String getColor(int n) {
    int index = n % (size());
    if (index < 0) {
        index += size();
    }
    return new java.lang.String(colorStrings[index]);
}