private java.util.List<org.kuali.kra.coi.disclosure.CoiDisclosedProjectBean> getDisclosedProjectsBasedOnAwardLink(java.util.List<org.kuali.kra.award.home.Award> awardsToCompleteDiscl, java.lang.String userId) {
    java.util.List<org.kuali.kra.coi.disclosure.CoiDisclosedProjectBean> disclosedProjects = new java.util.ArrayList<org.kuali.kra.coi.disclosure.CoiDisclosedProjectBean>();
    for (org.kuali.kra.award.home.Award award : awardsToCompleteDiscl) {
        java.util.List<org.kuali.coeus.common.framework.medusa.MedusaNode> medusaNodes = getMedusaService().getMedusaByAward(Constants.AWARD_MODULE, award.getAwardId(), true);
        org.kuali.kra.coi.disclosure.CoiDisclosedProjectBean disclosedProjectBean = new org.kuali.kra.coi.disclosure.CoiDisclosedProjectBean();
        populateDisclosedAwardsAndProposals(medusaNodes, userId, disclosedProjectBean);
        disclosedProjects.add(disclosedProjectBean);
    }
    return disclosedProjects;
}