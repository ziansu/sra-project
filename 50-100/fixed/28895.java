@java.lang.Override
public void computeGradientAndScore() {
    if ((layerWiseConfigurations.getBackpropType()) == (org.deeplearning4j.nn.conf.BackpropType.TruncatedBPTT)) {
        rnnActivateUsingStoredState(getInput(), true, true);
        truncatedBPTTGradient();
    }else {
        feedForward(true);
        backprop();
    }
    score = ((org.deeplearning4j.nn.layers.BaseOutputLayer<?>) (getOutputLayer())).computeScore(calcL1(), calcL2());
}