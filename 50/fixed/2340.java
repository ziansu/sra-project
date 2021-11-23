@org.junit.Test(timeout = 1000)
public void testSimpleExample() {
    MarkovModel mkMdl = new MarkovModel(2, "aabcabaacaac");
    double b = mkMdl.simpleEstimate("aab");
    assertTrue((b == (1.0 / 3.0)));
}