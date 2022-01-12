private static java.lang.String getWeightsString() {
    java.lang.String weightString = "";
    for (int i = 0; i < (PlayerSkeleton.weights.length); i++) {
        java.lang.System.out.println(PlayerSkeleton.weights[i]);
        weightString = (weightString + (PlayerSkeleton.weights[i])) + "\n";
    }
    weightString += PlayerSkeleton.hiddenNodeWeight;
    return weightString;
}