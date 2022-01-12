@org.junit.Test
public void test() {
    int nYears = 1000;
    for (int year = 0; year < nYears; year++) {
        model.step(year);
    }
    model.getReporters().printAllSpeciesCountSummary(model, nYears, 10.0, 10);
    org.junit.Assert.fail("Not yet implemented");
}