public static double lineClassify(double[] p, double b, double m) {
    if ((p[1]) > (b + (m * (p[0]))))
        return 1.0;
    else
        return 0.0;
    
}