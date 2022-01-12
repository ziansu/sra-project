public void persist() throws java.lang.Exception {
    removeDeletedSections();
    removeTemplateSection();
    createSectionDefinitionsForNewSections();
    if (createNew) {
        duplicateExistingPlanTemplate();
    }else {
        org.xcolab.portlets.contestmanagement.wrappers.ContestProposalTemplateWrapper.deletePlanSectionDefinitionsOfProposalTemplateIfNotUsedInAnotherTemplate(planTemplate);
    }
    addSectionsToProposalTemplate();
    updatePlanTemplateTitle();
}