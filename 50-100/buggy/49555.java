public double[] fire(double[] input) {
    if (((layers.size()) < 1) || ((input.length) != (numInputs)))
        return new double[]{ 0.0 };
    
    double[] out = input;
    for (opentenek.ann.net.NeuronLayer layer : layers) {
        out = layer.fire(out);
    }
    return out;
}