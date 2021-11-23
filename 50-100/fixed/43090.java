public final net.miginfocom.layout.AC gap(java.lang.String size, int... indexes) {
    net.miginfocom.layout.BoundSize bsa = (size != null) ? net.miginfocom.layout.ConstraintParser.parseBoundSize(size, true, true) : null;
    for (int i = (indexes.length) - 1; i >= 0; i--) {
        int ix = indexes[i];
        makeSize((ix + 1));
        if (bsa != null)
            cList.get(ix).setGapAfter(bsa);
        
    }
    return this;
}