@java.lang.Override
public void projectDelete(org.greengin.sciencetoolkit.common.model.Model project) {
    if (!(org.greengin.sciencetoolkit.spotit.model.ProjectManager.get().projectIsActive(project))) {
        org.greengin.sciencetoolkit.spotit.model.ProjectManager.get().deleteProject(project);
    }
}