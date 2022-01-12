@org.junit.Before
public void setUp() {
    variables = new java.util.ArrayList<>();
    variables.add(aima.test.core.unit.search.csp.TreeCSPSolverTest.WA);
    variables.add(aima.test.core.unit.search.csp.TreeCSPSolverTest.NT);
    variables.add(aima.test.core.unit.search.csp.TreeCSPSolverTest.Q);
    variables.add(aima.test.core.unit.search.csp.TreeCSPSolverTest.NSW);
    variables.add(aima.test.core.unit.search.csp.TreeCSPSolverTest.V);
    colors = new aima.core.search.csp.Domain("red", "green", "blue");
}