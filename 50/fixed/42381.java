public double calculateLLH() {
    return model.Loglikelihood.calculateLLH(userMap, venueMap, areaMap, isSigmoid, k);
}