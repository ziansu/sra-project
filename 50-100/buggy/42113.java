public void solve(java.lang.Boolean verbose) {
    java.util.Calendar cal = java.util.Calendar.getInstance();
    long start = cal.getTimeInMillis();
    java.lang.System.out.println("Solving puzzle...");
    findValidPath(puzzle.getGridCode(), verbose);
    long end = cal.getTimeInMillis();
    long duration = (end - start) / 1000;
    java.lang.System.out.println((("Duration: " + duration) + "s"));
    printSolution();
    puzzle.printPuzzle();
}