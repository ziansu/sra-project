public void setPercentValue(double percentValue) {
    this.percentValue = percentValue;
    this.absoluteValue = percentValue * (this.maxAbsoluteValue);
}