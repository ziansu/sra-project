@java.lang.Override
public java.lang.Integer query(edu.berkeley.cs.titan.Graph g, int i) {
    long id1 = (rand.nextLong()) % (NUM_NODES);
    long id2 = (rand.nextLong()) % (NUM_NODES);
    int atype = rand.nextInt(5);
    g.assocAdd(id1, id2, atype, java.lang.System.currentTimeMillis(), edu.berkeley.cs.benchmark.EDGE_ATTR);
    return 0;
}