@java.lang.SuppressWarnings(value = "unused")
private void printShapeArray(meyerowitz.alpha.Solver.InternalShape shape) {
    for (int i = 0; i < (shape.getTiles().length); i++) {
        for (int j = 0; j < (shape.getTiles().length); j++) {
            java.lang.System.out.print(shape.getTiles()[j][i]);
        }
        java.lang.System.out.println("");
    }
}