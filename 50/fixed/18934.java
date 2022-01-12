@java.lang.Override
protected boolean start(com.zaxxer.sparsebits.SparseBitSet b) {
    hash = 1234L;
    wMin = -1;
    wordMin = 0L;
    wMax = 0;
    wordMax = 0L;
    count = 0;
    cardinality = 0;
    return false;
}