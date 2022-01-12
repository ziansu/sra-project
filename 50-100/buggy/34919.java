public static double[] applyDropout(double[] input, double drop_out_ratio, int nodeSize) {
    if (drop_out_ratio > 0) {
        double multFact = 1 - drop_out_ratio;
        for (int index = 0; index < nodeSize; index++)
            input[index] *= multFact;
        
    }
    return input;
}