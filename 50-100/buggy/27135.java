private void exportOWLAxiom(@checkers.nullness.quals.NonNull
org.semanticweb.owlapi.model.OWLAxiom axiom) throws org.swrlapi.exceptions.SWRLBuiltInBridgeException {
    try {
        this.targetSWRLRuleEngine.defineOWLAxiom(axiom);
    } catch (org.swrlapi.exceptions.TargetSWRLRuleEngineException e) {
        throw new org.swrlapi.exceptions.SWRLBuiltInBridgeException(((("error exporting OWL axiom " + axiom) + " to target rule engine: ") + ((e.getMessage()) != null ? e.getMessage() : "")), e);
    }
}