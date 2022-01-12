public static double localEstimation(int[] scores, double ABbranch) {
    if (((scores[0]) + (scores[1])) == 0) {
        return 0.0;
    }
    double d = (ABbranch * ((double) (scores[2]))) / ((double) ((scores[0]) + (scores[1])));
    return d;
}