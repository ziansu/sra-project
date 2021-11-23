@org.junit.Test
public void testNonSequentialValue() {
    final int n = org.waarp.common.utility.test.UUIDTest.NB;
    java.lang.String[] ids = new java.lang.String[n];
    for (int i = 0; i < n; i++) {
        ids[i] = new org.waarp.common.utility.UUID().toString();
    }
    for (int i = 1; i < n; i++) {
        assertTrue((!(ids[(i - 1)].equals(ids[i].charAt(0)))));
    }
}