protected static long[] getHandles(mpi.Request[] r) {
    long[] h = new long[r.length];
    for (int i = 0; i < (r.length); i++) {
        if ((r[i]) != null)
            h[i] = r[i].handle;
        else
            h[i] = 0;
        
    }
    return h;
}