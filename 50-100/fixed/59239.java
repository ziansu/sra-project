public double calcFineFuelSpread(double WIND) {
    double A;
    double B;
    if (WIND < 14) {
        A = 0.01312;
        B = 6;
    }else {
        A = 0.009184;
        B = 14.4;
    }
    grass = ((A * (WIND + B)) * (java.lang.Math.pow(java.lang.Math.abs((33 - (FFM))), 1.65))) - 3;
    return grass;
}