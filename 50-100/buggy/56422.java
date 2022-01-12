@org.testng.annotations.BeforeMethod
public void beforeMethod() {
    management.limbr.ui.VaadinUI ui = org.mockito.Mockito.mock(management.limbr.ui.VaadinUI.class);
    com.vaadin.ui.UI.setCurrent(ui);
    management.limbr.ui.projects.ProjectsView view = org.mockito.Mockito.mock(management.limbr.ui.projects.ProjectsView.class);
    repository = org.mockito.Mockito.mock(management.limbr.data.ProjectRepository.class);
    editor = org.mockito.Mockito.mock(management.limbr.ui.projecteditor.ProjectEditorPresenter.class);
    presenter = new management.limbr.ui.projects.ProjectsPresenter(repository, editor);
    presenter.viewInitialized(view);
}