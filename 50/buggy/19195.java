@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
@com.github.dakusui.jcunit.examples.quadraticequation.session7.When(value = { "!#aIsNonZero" })
public void solveEquation1$thenThrowIllegalArgumentException() {
    com.github.dakusui.jcunit.examples.quadraticequation.session7.QuadraticEquationSolverTest7.ps.println(java.lang.String.format("(a,b,c)=(%d,%d,%d)", a, b, c));
    new com.github.dakusui.jcunit.examples.quadraticequation.session4.QuadraticEquationSolver(a, b, c).solve();
}