public void forward() {
    lowerActivations = neuralnet.MatrixOp.applyWeights(actualInput, lowerWeights);
    hiddenNeuronsValues = neuralnet.MatrixOp.applySigmoid(addBias(lowerActivations));
    upperActivations = neuralnet.MatrixOp.applyWeights(hiddenNeuronsValues, upperWeights);
    actualOutput = neuralnet.MatrixOp.applySigmoid(upperActivations);
}