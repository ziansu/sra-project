private void searchAndRemoveGraphicalSynapseCongif(org.eclipse.core.resources.IProject project) {
    try {
        if (project.hasNature(Constants.ESB_PROJECT_NATURE)) {
            deleteGraphicalSynapseConfigDir(project);
        }else
            if (project.hasNature(Constants.GENERAL_PROJECT_NATURE)) {
                deleteGraphicalSynapseConfigFiles(project);
            }
        
    } catch (org.eclipse.core.runtime.CoreException e) {
        org.wso2.developerstudio.eclipse.distribution.project.ui.wizard.ProjectImportWizard.log.error(("Error while deleting graphical-synapse-config directory in " + project));
    }
}