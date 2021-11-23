@java.lang.Override
public boolean solve(solvers.sat.ProblemInstance problemInstance) {
    this.problemInstance = problemInstance;
    init();
    timeExpansionGraph.increaseMakespan();
    java.util.List<org.sat4j.core.VecInt> cnfEncoding = timeExpansionGraph.getCnfEncoding(problemInstance.getAgents());
    for (org.sat4j.core.VecInt v : cnfEncoding) {
        java.lang.System.out.println(v);
    }
    java.lang.System.out.println();
    java.lang.System.out.println(passToExternalSatSolver());
    return false;
}