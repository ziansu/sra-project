@org.junit.Test
public void testFlatten() {
    int[] flat = blocked1.flatten();
    int[] cmp = new int[]{ 100 , 200 , 400 , 500 , 550 , 600 };
    org.junit.Assert.assertEquals("Flatten failed: check length", flat.length, cmp.length);
    for (int i = 0; i < (flat.length); i++) {
        org.junit.Assert.assertEquals("Flatten failed.", flat[i], cmp[i]);
    }
}