private void populateTheta() {
    theta[0] = parameters.getProbabilityMale("0", "0");
    theta[1] = parameters.getProbabilityMale("0", "1");
    theta[2] = parameters.getProbabilityMale("1", "0");
    theta[3] = parameters.getProbabilityMale("1", "1");
}