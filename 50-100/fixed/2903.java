public fish.Matrix diagonalReciprocal(double[] vector) {
    int[] units = new int[vector.length];
    for (int i = 0; i < (units.length); i++) {
        units[i] = 1;
    }
    return diagonalReciprocal(vector, units);
}