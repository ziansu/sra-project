public src.implementation.Grid compute() {
    boolean converged = false;
    int counter = 0;
    while (!converged) {
        converged = grid.serialComputation();
        try {
            assert (grid.getSum()) == 1.0;
        } catch (java.lang.Exception e) {
            java.lang.System.out.println(("assert failed bei : " + counter));
        }
        counter++;
    } 
    return grid;
}