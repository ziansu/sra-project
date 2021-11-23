public org.eclipse.emf.common.util.EList<no.hal.pg.quiz.runtime.QAProposal> getQAProposals(no.hal.pg.runtime.Player player) {
    org.eclipse.emf.common.util.EList<no.hal.pg.quiz.runtime.QAProposal> proposals = new org.eclipse.emf.common.util.BasicEList<no.hal.pg.quiz.runtime.QAProposal>();
    for (no.hal.pg.quiz.runtime.QAProposal proposal : getContext().getProposals()) {
        if (no.hal.pg.runtime.util.Util.containsPlayer(proposal, player, false)) {
            proposals.add(proposal);
        }
    }
    return proposals;
}