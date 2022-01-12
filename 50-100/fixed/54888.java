public boolean equals(java.lang.Object obj) {
    if (!(obj instanceof util.IntSetTIntSet)) {
        java.lang.System.err.println("OPERAND should be TIntSet");
        java.lang.System.exit((-1));
    }
    util.IntSetTIntSet temp = ((util.IntSetTIntSet) (obj));
    return this.contentEq(temp);
}