public double[] eval(double[] input, double drop_out_ratio, int maxOutk) {
    double[] output = super.eval(input, drop_out_ratio, maxOutk);
    hex.genmodel.algos.deeplearning.ActivationUtils.applyDropout(output, drop_out_ratio, output.length);
    return output;
}