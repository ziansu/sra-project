public static double generateRandomRangeDouble(double min, double max) {
    if (min > max) {
        double tmp = min;
        min = max;
        max = tmp;
    }else
        if (min == max) {
            return min;
        }
    
    return min + ((Utilities.random.nextDouble()) * (max - min));
}