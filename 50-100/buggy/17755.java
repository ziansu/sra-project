@java.lang.Override
public void validate() {
    super.validate();
    if (!(de.tudarmstadt.ukp.clarin.webanno.project.page.ImportUtil.isNameValid(projectNameTextField.getModelObject()))) {
        error("Project name shouldn\'t contain characters such as /\\*?&!$+[^]");
        de.tudarmstadt.ukp.clarin.webanno.project.page.ProjectPage.LOG.error("Project name shouldn\'t contain characters such as /\\*?&!$+[^]");
    }
    if ((repository.existsProject(projectNameTextField.getInput())) && (!(projectNameTextField.getInput().equals(projectNameTextField.getModelObject())))) {
        error("Another project with same name exists. Please try a different name");
    }
}