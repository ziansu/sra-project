com.intive.patronage.toz.proposals.model.Proposal create(final com.intive.patronage.toz.proposals.model.Proposal proposal) {
    final java.lang.String email = proposal.getEmail();
    if (proposalRepository.existsByEmail(email)) {
        throw new com.intive.patronage.toz.error.exception.AlreadyExistsException(com.intive.patronage.toz.proposals.ProposalService.PROPOSAL);
    }
    if (userRepository.existsByEmail(email)) {
        throw new com.intive.patronage.toz.error.exception.AlreadyExistsException(com.intive.patronage.toz.proposals.ProposalService.USER);
    }
    return proposalRepository.save(proposal);
}