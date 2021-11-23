public void forward() {
    lowerActivations = neuralnet.MatrixOp.applyWeights(addBias(actualInput), lowerWeights);
    hiddenNeuronsValues = neuralnet.MatrixOp.applySigmoid(addBias(lowerActivations));
    upperActivations = neuralnet.MatrixOp.applyWeights(hiddenNeuronsValues, upperWeights);
    actualOutput = neuralnet.MatrixOp.applySigmoid(upperActivations);
}