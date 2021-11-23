public java.util.Map<lowlevel.Transition, lowlevel.FlipFlop> getOutputTransitionOrigins() {
    outputTransOrigins = new java.util.HashMap<lowlevel.Transition, lowlevel.FlipFlop>();
    int ii = 0;
    for (lowlevel.Transition trans : this.getOutgoingInterClusterTransitions()) {
        outputTransOrigins.put(trans, this.getOutgoingTransFFs()[ii]);
    }
    return outputTransOrigins;
}