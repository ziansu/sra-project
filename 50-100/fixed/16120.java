public static double calcDistance(double[] arr1, double[] arr2) {
    double res = 0;
    for (int i = 0; i < (arr1.length); i++) {
        res += ((arr1[i]) - (arr2[i])) * ((arr1[i]) - (arr2[i]));
    }
    return res;
}