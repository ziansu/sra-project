public static double localEstimation(int[] scores, double ABbranch) {
    double d = (ABbranch * ((double) (scores[2]))) / ((double) ((scores[0]) + (scores[1])));
    return d;
}