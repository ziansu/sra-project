private static cz.muni.fi.pv021.neuralnet.LayeredNeuralNetwork buildNetworkTanh(double minWeight, double maxWeight, int... architecture) {
    cz.muni.fi.pv021.neuralnet.LayeredNeuralNetworkBuilder builder = new cz.muni.fi.pv021.neuralnet.LayeredNeuralNetworkBuilder();
    builder.setArchitecture(architecture);
    builder.setActivationFunction(new cz.muni.fi.pv021.neuralnet.HyperbolicTangens(1.7159, (2.0 / 3.0)));
    builder.setActivationFunctionDerivation(new cz.muni.fi.pv021.neuralnet.HyperbolicTangensDerivation(1.7159, (2.0 / 3.0)));
    builder.setInitialWeigthSupplier(new cz.muni.fi.pv021.neuralnet.UniformRandomInterval((-1.0), 1.0, new java.util.Random()));
    return builder.build();
}