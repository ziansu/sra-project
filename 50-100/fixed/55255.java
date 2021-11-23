static Position SelectPivotElement(double[][] a, int step) {
    int size = a.length;
    int maxRow = step;
    for (int i = step + 1; i < size; i++) {
        if ((java.lang.Math.abs(a[i][step])) > (java.lang.Math.abs(a[maxRow][step]))) {
            maxRow = i;
        }
    }
    Position pivot_element = new Position(maxRow, step);
    return pivot_element;
}