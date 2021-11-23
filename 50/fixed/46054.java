private double normalizeUnit(double number, int index) {
    if (index != (-1))
        return number * (java.lang.Math.pow(10, Functions.Density.POWERS[index]));
    
    return 0;
}