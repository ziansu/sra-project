public int BACToDrinks(double calculatedBAC, double weight, int gender) {
    if (calculatedBAC == 0)
        return 0;
    
    double bodyWater = getBodyWaterConstant(gender);
    double drinks = (((calculatedBAC + (edu.dartmouth.cs.SleepDrunk.ReactView.METABOLISM_CONSTANT)) * bodyWater) * weight) / ((edu.dartmouth.cs.SleepDrunk.ReactView.WATER_IN_BLOOD) * (edu.dartmouth.cs.SleepDrunk.ReactView.CONVERSION_FACTOR));
    int numberOfDrinks = ((int) (drinks));
    if (numberOfDrinks < 0)
        return 0;
    
    return numberOfDrinks;
}