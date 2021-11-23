public double getConfidence() {
    this.confidence = 100 - (this.probability);
    int cl = -100000;
    if ((this.probability) <= 0) {
        this.confidence = 100;
    }else {
        this.confidence = 100 + (cl / (this.probability));
    }
    return this.confidence;
}