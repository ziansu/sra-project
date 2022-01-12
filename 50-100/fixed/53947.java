private double calcEuclideanDistance(double[] a, double[] b) {
    double sum = 0;
    for (int i = 0; i < (a.length); i++) {
        if ((b.length) <= i)
            break;
        
        sum += java.lang.Math.pow(((a[i]) - (b[i])), 2);
    }
    return java.lang.Math.sqrt(sum);
}