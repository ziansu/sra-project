private java.lang.Boolean nameMatches(final org.scenarioo.model.design.entities.Issue issue, final java.lang.String objectName, final java.lang.String type) {
    if (type == "scenario") {
        return ((issue.getScenarioContextLink()) != null) && (issue.getScenarioContextLink().equals(objectName));
    }else {
        return ((issue.getUsecaseContextName()) != null) && (issue.getUsecaseContextName().equals(objectName));
    }
}