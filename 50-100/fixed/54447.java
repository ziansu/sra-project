public void delete() {
    org.fenixedu.academic.domain.exceptions.DomainException.throwWhenDeleteBlocked(getDeletionBlockers());
    this.getThesisProposalParticipantType().getThesisProposalParticipantSet().remove(this);
    this.setThesisProposalParticipantType(null);
    this.setUser(null);
    this.setThesisProposal(null);
    if ((this.getExternalUser()) != null) {
        this.getExternalUser().delete();
    }
    deleteDomainObject();
}