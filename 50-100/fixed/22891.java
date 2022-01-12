public final T getResult() {
    try {
        jsr166y.ForkJoinPool.managedBlock(this);
    } catch (java.lang.InterruptedException ignore) {
    } catch (java.lang.Throwable re) {
        water.MRTask.setException(re);
    }
    water.DException.DistributedException de = water.MRTask.getDException();
    if (de != null)
        throw de;
    
    assert _topGlobal : "lost top global flag";
    return self();
}