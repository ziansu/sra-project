protected static int numberSolutions(java.lang.String dir) {
    java.io.File out = new java.io.File(((dir + (java.io.File.separator)) + "src"));
    org.junit.Assert.assertTrue(((out.listFiles().length) > 1));
    int cantSol = 0;
    for (java.io.File sol : out.listFiles()) {
        cantSol += (sol.getName().startsWith("variant-")) ? 1 : 0;
    }
    return cantSol;
}