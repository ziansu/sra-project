private static cz.muni.fi.pv021.neuralnet.LayeredNeuralNetwork buildNetworkTanh(double a, double b, double minWeight, double maxWeight, int... architecture) {
    cz.muni.fi.pv021.neuralnet.LayeredNeuralNetworkBuilder builder = new cz.muni.fi.pv021.neuralnet.LayeredNeuralNetworkBuilder();
    builder.setArchitecture(architecture);
    builder.setActivationFunction(new cz.muni.fi.pv021.neuralnet.HyperbolicTangens(a, b));
    builder.setActivationFunctionDerivation(new cz.muni.fi.pv021.neuralnet.HyperbolicTangensDerivation(a, b));
    builder.setInitialWeigthSupplier(new cz.muni.fi.pv021.neuralnet.UniformRandomInterval(minWeight, maxWeight, new java.util.Random()));
    return builder.build();
}