protected void run() {
    double r = 0;
    if (r < 0.1) {
        fail("oops");
    }else
        if (r < 0.2) {
            throw new org.junit.internal.AssumptionViolatedException("skipping");
        }
    
}