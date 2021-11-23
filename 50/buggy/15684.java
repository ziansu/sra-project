public void establishOutputNeuronError(float target) {
    if (harlequinmettle.investmentadviserengine.neuralnet.artificailneuralnet.ArtificailNeuralNet.debugMethodsWithReflection)
        harlequinmettle.utils.reflection.RuntimeDetails.getPrintMethodInfo();
    
    error = (derivative) * (target - (output));
}