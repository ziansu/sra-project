public void geometricSeriesApproximation(double x) {
    double nextApproximation = x;
    for (int i = 0; i < (this.steps); i++) {
        nextApproximation = nextApproximation * x;
    }
    this.approximation = (this.lastApproximation) + nextApproximation;
    (this.steps)++;
    if (!(isAccurate())) {
        geometricSeriesApproximation(x);
    }else {
        return ;
    }
}