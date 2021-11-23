private void calculateIotaFunction(int step) {
    newMatrix[0][0] = calculateXor(oldMatrix[0][0], roundConstants[step]);
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            oldMatrix[i][j] = newMatrix[i][j].substring(0);
        }
    }
}