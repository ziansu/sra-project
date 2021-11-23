private void expectation() {
    double probM = 0.0;
    populateTheta();
    for (int i = 0; i < 4; i++) {
        probM = theta[i];
        expectedCounts[i] = probM * (numOfConfig[i]);
        expectedCounts[(4 + i)] = (1 - probM) * (numOfConfig[(4 + i)]);
    }
}