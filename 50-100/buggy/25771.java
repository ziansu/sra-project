private void calculateIotaFunction(int step) {
    newMatrix[0][0] = calculateXor(oldMatrix[0][0], roundConstants[step]);
    for (int i = 0; i < 5; i++) {
        java.lang.System.arraycopy(newMatrix[i], 0, oldMatrix[i], 0, 5);
    }
}