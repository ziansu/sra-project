public java.util.HashSet<de.rwth.i2.attestor.modelChecking.Assertion> getSuccessors(de.rwth.i2.attestor.modelChecking.Assertion current) {
    java.util.HashSet<de.rwth.i2.attestor.modelChecking.Assertion> successors = new java.util.HashSet<de.rwth.i2.attestor.modelChecking.Assertion>();
    if ((this.edges.get(current)) != null) {
        for (de.rwth.i2.attestor.modelChecking.ProofStructure.SuccState successor : this.edges.get(current)) {
            successors.add(successor.assertion);
        }
    }
    return successors;
}