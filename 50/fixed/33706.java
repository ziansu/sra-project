public double reactionTimeToBAC(double rxnTimeDiff) {
    if (rxnTimeDiff < 2.4)
        return 0;
    
    double calculatedBAC = (0.0269 * (java.lang.Math.log(rxnTimeDiff))) - 0.0225;
    return calculatedBAC;
}