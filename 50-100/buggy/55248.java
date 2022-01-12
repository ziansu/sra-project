private static double calcPriceInterval(double min, double max, double distance, double rate) {
    if (distance <= min)
        return 0;
    
    if (distance > max)
        return (max - min) * rate;
    
    return (distance - min) * rate;
}