public void setAbsoluteValue(double absoluteValue) {
    this.absoluteValue = absoluteValue;
    this.percentValue = (absoluteValue * 100) / (this.maxAbsoluteValue);
}