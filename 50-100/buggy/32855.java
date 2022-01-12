private static java.lang.Integer multiplyArrays(java.util.ArrayList<java.lang.Integer> arrayListA, java.util.ArrayList<java.lang.Integer> arrayListB) {
    nevelev.dima.matrix.MatrixMultiplier.validate(arrayListA, arrayListB);
    java.lang.Integer result = 0;
    for (int x = 0; x < (arrayListA.size()); x++) {
        result += (arrayListA.indexOf(x)) * (arrayListB.indexOf(x));
    }
    return result;
}