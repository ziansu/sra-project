public double getPercentTimeInColor(long totalTime) {
    if (totalTime == 0) {
        return 100.0;
    }else {
        return (((double) (timeInColor)) / totalTime) * 100.0;
    }
}