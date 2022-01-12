private static java.lang.String getWeightsString() {
    java.lang.String weightString = "";
    for (int i = 0; i < (PlayerSkeleton.weights.length); i++) {
        weightString = (weightString + (PlayerSkeleton.weights[i])) + "\n";
    }
    weightString += PlayerSkeleton.hiddenNodeWeight;
    return weightString;
}