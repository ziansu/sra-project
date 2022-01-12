protected static long[] getHandles(mpi.Request[] r) {
    long[] h = new long[r.length];
    for (int i = 0; i < (r.length); i++)
        h[i] = r[i].handle;
    
    return h;
}