public info.javaperformance.malloc.SingleThreadedBlock getBlock(final int requiredSize, final info.javaperformance.buckets.Buckets data) {
    info.javaperformance.malloc.SingleThreadedBlock cur = getCurrentBlock(false, data);
    if (!(cur.hasSpace(requiredSize))) {
        cur.writeFinished();
        cur = getCurrentBlock(true, data);
    }
    return cur;
}