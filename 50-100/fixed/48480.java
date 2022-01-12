public void run() {
    java.util.ArrayList<org.eclipse.core.resources.IProject> projects = new java.util.ArrayList<org.eclipse.core.resources.IProject>();
    projects.add(arr.utils.ProjectUtilities.getCurrentProject());
    if ((projects.size()) == 0) {
        arr.ui.MessageSystem.runProjectFirst();
        return ;
    }
    projects.add(0, null);
    if (arr.ui.ARRRun.run(projects))
        arr.ui.MessageSystem.sucessfullyFinished();
    
    return ;
}