public void setConnectionProject(org.geppetto.core.data.model.IGeppettoProject geppettoProject) throws org.geppetto.core.common.GeppettoExecutionException {
    if ((this.geppettoProject) != null) {
        geppettoManager.closeProject(null, geppettoProject);
    }
    this.geppettoProject = geppettoProject;
}