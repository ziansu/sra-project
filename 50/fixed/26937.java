public void union(final int[] pre) {
    pres = org.basex.query.value.seq.DBNodes.union(pres, pre);
    size = pres.length;
    sorted = null;
}