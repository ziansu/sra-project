public neuro.NeuroModel trainModel(neuro.NumImage[] trainData, neuro.NeuroModel model) {
    for (int i = 0; i < (config.get_iterations()); i++) {
        neuro.NeuroDerivatives derivatives = new neuro.NeuroDerivatives(model);
        double costFunc = neuro.NeuroDescend.computeDerivativesDistributed(model, derivatives, trainData);
        model.updateTheta(derivatives);
        config.getLogger().trace(((i + " Cost: ") + costFunc));
    }
    return model;
}