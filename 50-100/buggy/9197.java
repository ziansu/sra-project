public double calculateIntegral() {
    double temp = calculateIntegralAtIteration();
    double diff = 0.0;
    do {
        double integralValue = calculateIntegralAtIteration();
        diff = java.lang.Math.abs((integralValue - temp));
        temp = integralValue;
        java.lang.System.out.println(("Diff : " + diff));
    } while (diff > 1.0E-8 );
    return temp;
}