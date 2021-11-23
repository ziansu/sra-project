public void setAbsoluteValue(double absoluteValue) {
    this.absoluteValue = absoluteValue;
    this.percentValue = absoluteValue / (this.maxAbsoluteValue);
}