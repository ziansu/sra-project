public boolean equals(java.lang.Object obj) {
    if (!((set) instanceof util.IntSetTIntSet)) {
        java.lang.System.err.println("OPERAND should be TIntSet");
        java.lang.System.exit((-1));
    }
    util.IntSetTIntSet temp = ((util.IntSetTIntSet) (set));
    return this.contentEq(temp);
}