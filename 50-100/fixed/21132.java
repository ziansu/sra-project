public void geometricSeriesApproximationStep1(double x) {
    this.steps = 0;
    this.lastApproximation = 1;
    double nextApproximation = x;
    for (int i = 0; i < (steps); i++) {
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