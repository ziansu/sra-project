public void actionPerformed(java.awt.event.ActionEvent e) {
    GeneticAlgSolver geneticSolver = new GeneticAlgSolver(GUI.table);
    CandidateSolution solution = geneticSolver.run();
    int[] results = compileResults(solution);
    final long startTime = java.lang.System.nanoTime();
    java.lang.String energy = java.lang.Integer.toString(geneticSolver.getEnergy());
    final long endTime = java.lang.System.nanoTime();
    java.lang.System.out.println(("Total execution time: " + ((endTime - startTime) / 1000000000)));
    printResult(results, energy, solution);
}