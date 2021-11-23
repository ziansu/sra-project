public double logIndirectP(int[] y, int[] x, Params params, double xi, ForwardBackward fwbw) throws java.lang.Exception {
    int M = 20;
    double the_sum = 0;
    for (int i = 0; i < M; i++) {
        int[] z = fwbw.sample(Main.randomizer);
        double logQ = logQ(y, z, params);
        the_sum += java.lang.Math.exp(logQ);
    }
    return java.lang.Math.log((the_sum / M));
}