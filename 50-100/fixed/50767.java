public java.util.Map<lowlevel.Transition, lowlevel.FlipFlop> getOutputTransitionOrigins() {
    outputTransOrigins = new java.util.HashMap<lowlevel.Transition, lowlevel.FlipFlop>();
    int ii = 0;
    for (lowlevel.Transition trans : this.getOutgoingInterClusterTransitions()) {
        if ((this.getOutgoingTransFFs()) != null) {
            outputTransOrigins.put(trans, this.getOutgoingTransFFs().get(ii));
        }
        ii++;
    }
    return outputTransOrigins;
}