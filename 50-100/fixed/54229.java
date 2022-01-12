public void actionPerformed(java.awt.event.ActionEvent e) {
    GeneticAlgSolver geneticSolver = new GeneticAlgSolver(GUI.table);
    int[] results = compileResults(solution);
    final long startTime = java.lang.System.nanoTime();
    CandidateSolution solution = geneticSolver.run();
    final long endTime = java.lang.System.nanoTime();
    java.lang.String energy = java.lang.Integer.toString(geneticSolver.getEnergy());
    printResult(results, energy, solution);
}