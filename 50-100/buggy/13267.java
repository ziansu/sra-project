public static double[] concordia(double r207Pb_235U, double r207Pb_235U_1SigmaAbs, double r206Pb_238U, double r206Pb_238U_1SigmaAbs, double rho) {
    double[] retVal = new double[]{ 0 , 0 , 0 };
    double[] inputData;
    if ((r207Pb_235U > 0.0) && (r206Pb_238U > 0.0)) {
        inputData = new double[]{ r207Pb_235U , r207Pb_235U_1SigmaAbs , r206Pb_238U , r206Pb_238U_1SigmaAbs , rho };
        retVal = org.cirdles.ludwig.isoplot3.Pub.concordiaAges(inputData);
    }
    return retVal;
}