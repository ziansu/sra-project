@java.lang.Override
public tag.Data.Point play(tag.Viewer v) {
    this.neuralNetwork.setInput(this.getDoubleArray(v));
    tag.player.SimplePlayer.neuralNetwork.calculate();
    double[] output = tag.player.SimplePlayer.neuralNetwork.getOutput();
    return getPointFromOutput(v, output);
}