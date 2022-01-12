@java.lang.Override
public java.lang.Integer warmupQuery(edu.berkeley.cs.titan.Graph g, int i) {
    long id1 = (java.lang.Math.abs(warmupRand.nextLong())) % (NUM_NODES);
    long id2 = (java.lang.Math.abs(warmupRand.nextLong())) % (NUM_NODES);
    int atype = warmupRand.nextInt(5);
    g.assocAdd(id1, id2, atype, java.lang.System.currentTimeMillis(), edu.berkeley.cs.benchmark.EDGE_ATTR);
    return 0;
}