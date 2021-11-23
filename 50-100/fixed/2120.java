public void toggle(final int pre) {
    final int[] n = new int[]{ pre };
    pres = (contains(pre)) ? org.basex.query.value.seq.DBNodes.except(pres, n) : org.basex.query.value.seq.DBNodes.union(pres, n);
    size = pres.length;
    sorted = null;
}