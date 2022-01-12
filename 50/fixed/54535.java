public double getPrediction(com.yahoo.labs.samoa.instances.Instance inst) {
    return children.get(splitTest.branchForInstance(inst)).getPrediction(inst);
}