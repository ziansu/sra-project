public void setEnd(int endIndex) {
    this.endIndex = endIndex;
    this.length = (endIndex - (startIndex)) + 1;
}