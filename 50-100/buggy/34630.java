@java.lang.Override
public void userEnterProjectName(java.lang.String projectName) {
    tobedevelopers.project_fury.create_project.CreateProjectContract.View view = viewWeakReference.get();
    if (view != null) {
        mProjectName = projectName;
        if ((projectName.length()) < 3) {
            view.setProjectNameUnderValidation();
            view.disableCreateProjectButton();
        }else
            if ((projectName.length()) >= 20) {
                view.setProjectNameOverValidation();
                view.disableCreateProjectButton();
            }else
                view.enableCreateProjectButton();
            
        
    }
}