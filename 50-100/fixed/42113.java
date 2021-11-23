public void solve(java.lang.Boolean verbose) {
    long start = java.util.Calendar.getInstance().getTimeInMillis();
    java.lang.System.out.println("Solving puzzle...");
    findValidPath(puzzle.getGridCode(), verbose);
    long end = java.util.Calendar.getInstance().getTimeInMillis();
    long duration = (end - start) / 1000;
    java.lang.System.out.println((("Duration: " + duration) + "s"));
    printSolution();
    puzzle.printPuzzle();
}