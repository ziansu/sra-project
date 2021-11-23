public java.lang.Object[] decode(vmm.IntSequence iseq) {
    java.lang.Object[] res = new java.lang.String[(iseq.length()) - 1];
    for (int i = 1; i < (iseq.length()); i++) {
        res[(i - 1)] = getDecodedSymbol(iseq.intAt(i));
    }
    return res;
}