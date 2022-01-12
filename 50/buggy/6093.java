public void setTimeSignature(int timeSignature) {
    this.timeSignature = timeSignature;
    barTime = timeSignature * 1000;
    displayTime = (barTime) * 4;
}