public void testEclipsedOneWindow() {
    edu.illinois.adsc.RateTracker rt = new edu.illinois.adsc.RateTracker(10000, 10, true);
    rt.notify(1);
    float r1 = rt.reportRate();
    rt.set_ticks(((rt.get_ticks()) + (rt.get_slideSizeInMils())));
    rt.notify(1);
    float r2 = rt.reportRate();
    assert (2 * r1) == r2;
}