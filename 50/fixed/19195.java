@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
@com.github.dakusui.jcunit.examples.quadraticequation.session7.When(value = { "!#aIsNonZero" })
public void solveEquation1$thenThrowIllegalArgumentException() {
    new com.github.dakusui.jcunit.examples.quadraticequation.session4.QuadraticEquationSolver(a, b, c).solve();
}