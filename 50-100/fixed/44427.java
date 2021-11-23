public static void recordSolution(killersudokusolver.Generator[] generators) {
    java.lang.System.out.println("SOLUTION FOUND!");
    for (killersudokusolver.Generator g : generators) {
        java.lang.System.out.println((((g.getVariable()) + " : ") + (g.getVariable().getValue())));
    }
}