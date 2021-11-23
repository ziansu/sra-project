public boolean allColumnZero(int i, Matrix M) {
    boolean foundNotZero = false;
    int j = 0;
    while ((!foundNotZero) && (j < (((M.getNCol()) - 1) / 2))) {
        if ((M.get(i, j)) > 1.0E-8) {
            foundNotZero = true;
        }else {
            j++;
        }
    } 
    return !foundNotZero;
}