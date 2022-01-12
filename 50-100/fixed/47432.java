private java.lang.String checkWeightAgainstImage(int[] featureImage) {
    double sum = 0;
    for (int i = 0; i < (featureImage.length); i++) {
        sum += (featureImage[i]) * (weights[i]);
    }
    return sum > 1 ? "Yes" : "other";
}