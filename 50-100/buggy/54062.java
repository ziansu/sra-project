public long queryOneTime() {
    java.util.ArrayList<double[][]> lin = encryptPerformance();
    java.util.ArrayList<double[][]> lout = encryptPerformance();
    long t0 = java.lang.System.currentTimeMillis();
    java.util.ArrayList<double[][]> intersection = intersectAll(lin, lout);
    double sum = query(intersection);
    java.lang.System.out.println(decode(sum));
    return (java.lang.System.currentTimeMillis()) - t0;
}