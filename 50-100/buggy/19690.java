public synchronized org.liveontologies.owlapi.proof.util.ProofNode<org.semanticweb.owlapi.model.OWLAxiom> getProofRoot() {
    if (!(proofRootUpToDate_)) {
        proofService_.getProof(entailment_);
        proofRoot_ = ((proofService_) == null) ? new org.liveontologies.owlapi.proof.util.LeafProofNode<org.semanticweb.owlapi.model.OWLAxiom>(entailment_) : proofService_.getProof(entailment_);
        proofRoot_ = org.liveontologies.owlapi.proof.util.ProofNodes.eliminateNotDerivableAndCycles(proofRoot_, importsClosureRec_.getStatedAxiomsWithoutAnnotations());
        proofRootUpToDate_ = true;
    }
    return proofRoot_;
}