@java.lang.Override
public void userEnterProjectDescription(java.lang.String projectDescription) {
    tobedevelopers.project_fury.create_project.CreateProjectContract.View view = viewWeakReference.get();
    if (view != null) {
        mProjectDescription = projectDescription;
        if ((projectDescription.length()) > 128)
            view.disableCreateProjectButton();
        
        if ((projectDescription.length()) >= 128)
            view.setProjectDescriptionOverValidation();
        
    }
}