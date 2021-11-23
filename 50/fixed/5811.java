@java.lang.Override
public boolean isModified(org.testeditor.core.model.teststructure.TestStructure testStructure) {
    org.testeditor.core.services.plugins.TeamShareStatusServicePlugIn teamShareStatus = getTeamShareStatusPlugIn(testStructure.getRootElement());
    if (teamShareStatus != null) {
        return teamShareStatus.isModified(testStructure);
    }
    return false;
}