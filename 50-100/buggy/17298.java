@org.junit.Test
public void testRule() throws java.io.IOException {
    check(0, "Au plecat câteșitrei.");
    check(1, "câte și trei", new java.lang.String[]{ "câteșitrei" });
    check(1, "Câte și trei", new java.lang.String[]{ "Câteșitrei" });
    check(1, "câte-și-trei", new java.lang.String[]{ "câteșitrei" });
    check(1, "tus trei", new java.lang.String[]{ "tustrei" });
    check(1, "tus-trei", new java.lang.String[]{ "tustrei" });
}