@org.junit.Test
public void testE() {
    printMatrix(ejercicio3.exerciseE(triangular1, triangularInferior, calculator));
    java.lang.System.out.println(("Operations: " + (calculator.getCount())));
}