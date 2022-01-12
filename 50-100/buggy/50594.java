@java.lang.Override
public void componentRenamed(de.uni.freiburg.iig.telematik.swat.logs.LogModel component, java.lang.String oldName, java.lang.String newName) throws de.invation.code.toval.misc.wd.ProjectComponentException {
    if (analysisContainers.containsKey(oldName)) {
        java.util.Collection<de.uni.freiburg.iig.telematik.swat.analysis.Analysis> analyses = getContainerAnalysis(oldName).getComponents();
        getContainerAnalysis(oldName).removeComponents(true, false);
        analysisContainers.put(newName, createNewAnalysisContainer(component));
        for (de.uni.freiburg.iig.telematik.swat.analysis.Analysis analysis : analyses) {
            getContainerAnalysis(newName).addComponent(analysis, true, false);
        }
    }
}