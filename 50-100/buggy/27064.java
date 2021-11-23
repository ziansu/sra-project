private static double roundToTwoDigits(double value, boolean roundDown) {
    if (value < 0.005)
        return 0.0;
    
    double division = value % 0.01;
    if ((division < 1.0E-9) && (division >= 0.0))
        return value;
    
    double modifier = (roundDown) ? -0.5 : 0.5;
    return (java.lang.Math.floor(((value * 100) + modifier))) / 100;
}