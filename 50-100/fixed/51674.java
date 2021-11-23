public java.lang.String deactivateSelected() {
    try {
        parentSection = ((ru.sbt.drtmn.lab.model.Section) (sectionManager.get(new java.lang.Long(parentSectionId))));
        pageTitle = parentSection.getName();
        java.lang.Integer count = configurationManager.deactivateMsgConfigurations(selectedBox);
        configurations = sectionManager.getSectionConfigurations(parentSection);
        ru.sbt.drtmn.lab.webapp.action.ConfigurationAction.logger.debug((("Deactivated: " + count) + " configurations"));
    } catch (ru.sbt.drtmn.lab.dao.SearchException se) {
        addActionError(se.getMessage());
        configurations = sectionManager.getSectionConfigurations(parentSection);
    }
    return SUCCESS;
}