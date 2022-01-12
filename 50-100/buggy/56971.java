@org.junit.Test
public void testFromQuickly2() {
    int size = 2048;
    int[] a = com.github.methylene.sym.Util.distinctInts(size, 8);
    com.github.methylene.sym.Permutation random;
    do {
        random = com.github.methylene.sym.Permutation.random(size);
    } while (random.isIdentity() );
    int[] b = random.apply(a);
    org.junit.Assert.assertFalse(java.util.Arrays.equals(a, b));
    org.junit.Assert.assertArrayEquals(com.github.methylene.sym.Permutation.from(a, b).apply(a), b);
}