private void testFromSlowly3() {
    int size = 2048;
    java.lang.Object[] a = com.github.methylene.sym.PermutationTest.distinctMyInts(size, 8);
    if ((java.lang.Math.random()) < 0.5)
        a[((int) (size * (java.lang.Math.random())))] = null;
    
    java.lang.Object[] b = com.github.methylene.sym.Permutation.random(size).apply(a);
    org.junit.Assert.assertArrayEquals(com.github.methylene.sym.Permutation.from(a, b).apply(a), b);
}