private void runSimAnn() {
    SimulatedAnnealing sa = new SimulatedAnnealing(GUI.table);
    long startTime = java.lang.System.nanoTime();
    CandidateSolution solution = sa.saSolution();
    long endTime = java.lang.System.nanoTime();
    long timeTaken = (endTime - startTime) / 1000000000;
    java.lang.System.out.println(("Total execution time: " + timeTaken));
    int[] results = compileResults(solution);
    java.lang.String energy = java.lang.Integer.toString(solution.getEnergy());
    printResult(results, energy, solution);
}