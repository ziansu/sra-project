public double getPrediction(com.yahoo.labs.samoa.instances.Instance inst, moa.classifiers.trees.FIMTDD tree) {
    return children.get(splitTest.branchForInstance(inst)).getPrediction(inst);
}