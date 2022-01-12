private java.lang.String checkWeightAgainstImage(int[] featureImage) {
    int sum = 0;
    for (int i = 1; i < (featureImage.length); i++) {
        sum += (featureImage[i]) * (weights[i]);
    }
    return sum < 1 ? "Yes" : "other";
}