private static boolean[] allTests(long[] statistics, int r, double z) {
    return new boolean[]{ Test.equalProbabilityTest(statistics, z) , Test.elementIndependenceTest(statistics, z) , Test.sequenceHomogeneityTest(statistics, r, z) };
}