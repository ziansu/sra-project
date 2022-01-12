private static void runSolver(final java.lang.String fileNameTestData) throws java.lang.Exception {
    final java.lang.String firstLine;
    {
        final java.io.BufferedReader br = new java.io.BufferedReader(new java.io.FileReader(fileNameTestData));
        firstLine = br.readLine();
        br.close();
    }
    if ((firstLine.length()) == 19) {
        colorfill.ui.Starter.runSolverCg26232(fileNameTestData);
    }else {
        colorfill.ui.Starter.runSolverPc19(fileNameTestData);
    }
}