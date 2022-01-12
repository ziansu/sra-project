public double getConfidenceScore() {
    return (this.steinerNodes.getConfidence()) == null ? 0.0 : this.steinerNodes.getConfidence().getConfidenceValue();
}