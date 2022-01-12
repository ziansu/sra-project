private double logYGivenComponent(edu.neu.ccs.pyramid.dataset.MultiLabel y, int k) {
    double sum = 0.0;
    for (int l = 0; l < (numLabels); l++) {
        if (y.matchClass(l)) {
            sum += logClassProbs[k][l];
        }else {
            sum += 1 - (logClassProbs[k][l]);
        }
    }
    return sum;
}