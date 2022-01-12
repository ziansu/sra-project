public void calculateOutput() {
    double incomingTotal = 0.0;
    if (((type) == 2) || ((type) == 4)) {
        for (NodeWeightPair parent : parents) {
            double parentValue = parent.node.getOutput();
            double parentWeight = parent.weight;
            incomingTotal += parentValue * parentWeight;
        }
        this.outputValue = java.lang.Math.max(0.0, incomingTotal);
    }
}