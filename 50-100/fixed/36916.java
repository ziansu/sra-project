public double trace() throws java.lang.IllegalArgumentException {
    m = this.m;
    n = this.n;
    double ace = 0;
    if ((m) != (n)) {
        java.lang.String ex = "Rows and Columns must be same length.";
        throw new java.lang.IllegalArgumentException(ex);
    }
    for (int i = 0; i < (m); i++) {
        ace += this.get(i, i);
    }
    return ace;
}