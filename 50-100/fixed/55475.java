private void copyRecursive(int shapeIdx, int[] indexes) {
    if ((shape.length) == shapeIdx) {
        output.putScalar(indexes, input[((inputIdx)++)]);
    }else {
        for (int i = 0; i < (shape[shapeIdx]); i++) {
            indexes[shapeIdx] = i;
            copyRecursive((shapeIdx + 1), indexes);
        }
    }
}