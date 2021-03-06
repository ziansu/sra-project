private neuralNetwork.deep.DeepNeuralNetwork.BackpropResult linearActivationBackward(neuralNetwork.deep.Matrix2 dA, neuralNetwork.deep.DeepNeuralNetwork.CacheItem cache, neuralNetwork.deep.DeepNeuralNetwork.BackwardOp activation) {
    neuralNetwork.deep.Matrix2 dZ = activation.apply(dA, cache.activationCache);
    return linearBackward(dZ, cache.linearCache);
}