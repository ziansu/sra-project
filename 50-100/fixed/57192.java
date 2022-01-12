public double[] getOut() {
    double[] out = new double[outNum];
    for (int i = 0; i < (outNum); i++) {
        out[i] = nodes.get((i + (inNum))).get();
    }
    return out;
}