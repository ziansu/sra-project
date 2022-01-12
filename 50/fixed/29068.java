@java.lang.Override
public tag.Data.Point play(tag.Viewer v) {
    this.neuralNetwork.setInput(this.getDoubleArray(v));
    neuralNetwork.calculate();
    double[] output = neuralNetwork.getOutput();
    return getPointFromOutput(v, output);
}