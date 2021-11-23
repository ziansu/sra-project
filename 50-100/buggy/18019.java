private void populateTheta(Parameters params) {
    theta[0] = params.getProbabilityMale("0", "0");
    theta[1] = params.getProbabilityMale("0", "1");
    theta[2] = params.getProbabilityMale("1", "0");
    theta[3] = params.getProbabilityMale("1", "1");
}