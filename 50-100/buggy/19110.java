@java.lang.SafeVarargs
private final <E> void testGeneratesAll(final java.util.function.Supplier<E> generator, final E... expected) {
    final E[] selected = java.util.Arrays.copyOf(expected, io.github.pr0methean.betterrandom.prng.BaseRandomTest.ELEMENTS);
    for (int i = 0; i < (io.github.pr0methean.betterrandom.prng.BaseRandomTest.ELEMENTS); i++) {
        selected[i] = generator.get();
    }
    org.testng.Assert.assertTrue(java.util.Arrays.asList(selected).containsAll(java.util.Arrays.asList(expected)));
}