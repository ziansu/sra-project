public void test_getLimits() {
    double[] orgLimits = ((double[]) (limits.clone()));
    double[] l = f1.getLimits();
    assertTrue("Wrong limits", (l == (limits)));
    l[0] = 3.14527;
    assertTrue("Limits copied", (l != orgLimits));
}