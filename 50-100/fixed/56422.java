@org.testng.annotations.BeforeMethod
public void beforeMethod() {
    management.limbr.ui.VaadinUI ui = mock(management.limbr.ui.VaadinUI.class);
    com.vaadin.ui.UI.setCurrent(ui);
    view = mock(management.limbr.ui.projects.ProjectsView.class);
    repository = mock(management.limbr.data.ProjectRepository.class);
    editor = mock(management.limbr.ui.projecteditor.ProjectEditorPresenter.class);
    presenter = new management.limbr.ui.projects.ProjectsPresenter(repository, editor);
    presenter.viewInitialized(view);
}