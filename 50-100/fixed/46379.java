public void insertLong(long oid, int schPage, int schOffs) {
    long newVal = (((long) (schPage)) << 32) | ((long) (schOffs));
    idx.insertLong(oid, newVal);
    lastAllocatedInMemory.update(oid);
}