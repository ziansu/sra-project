@java.lang.Override
public void setRangePercentageIncrement(double downLimit, double upLimit, double percentageIncrement) {
    this.current = downLimit;
    this.increment = percentageIncrement * (upLimit - downLimit);
    if ((java.lang.Double.compare(this.increment, 0.0)) < 0) {
        throw new java.lang.IllegalArgumentException("Check your limits and percentage increment");
    }
    this.downLimit = downLimit;
    this.upLimit = upLimit;
}