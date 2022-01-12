private java.util.List<org.kuali.kra.coi.disclosure.CoiDisclosedProjectBean> getDisclosedProjectsBasedOnDevelopmentProposalLink(java.util.List<org.kuali.coeus.propdev.impl.core.DevelopmentProposal> devProposalsToCompleteDiscl, java.lang.String userId) {
    java.util.List<org.kuali.kra.coi.disclosure.CoiDisclosedProjectBean> disclosedProjects = new java.util.ArrayList<org.kuali.kra.coi.disclosure.CoiDisclosedProjectBean>();
    for (org.kuali.coeus.propdev.impl.core.DevelopmentProposal devProposal : devProposalsToCompleteDiscl) {
        java.util.List<org.kuali.coeus.common.framework.medusa.MedusaNode> medusaNodes = getMedusaService().getMedusaByProposal(Constants.DEVELOPMENT_PROPOSAL_MODULE, java.lang.Long.parseLong(devProposal.getProposalNumber()));
        org.kuali.kra.coi.disclosure.CoiDisclosedProjectBean disclosedProjectBean = new org.kuali.kra.coi.disclosure.CoiDisclosedProjectBean();
        populateDisclosedAwardsAndProposals(medusaNodes, userId, disclosedProjectBean);
        disclosedProjects.add(disclosedProjectBean);
    }
    return disclosedProjects;
}