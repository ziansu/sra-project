@java.lang.Override
public int[] solve(org.moflon.tgg.algorithm.datastructures.Graph sourceGraph, org.moflon.tgg.algorithm.datastructures.Graph targetGraph, org.moflon.tgg.algorithm.datastructures.ConsistencyCheckPrecedenceGraph protocol) {
    net.sf.javailp.SolverFactory factory = getSolverFactory();
    factory.setParameter(Solver.VERBOSE, 0);
    net.sf.javailp.Problem ilpProblem = createIlpProblemFromGraphs(sourceGraph, targetGraph, protocol);
    variableCount = ilpProblem.getVariablesCount();
    constraintCount = ilpProblem.getConstraintsCount();
    net.sf.javailp.Solver solver = factory.get();
    net.sf.javailp.Result result = solver.solve(ilpProblem);
    int[] arrayResult = getArrayFromResult(result);
    return arrayResult;
}