public java.lang.Object execute(org.eclipse.core.commands.ExecutionEvent event) throws org.eclipse.core.commands.ExecutionException {
    view.AskProjectName pNameWindow = new view.AskProjectName();
    model.Project project = new model.Project(pNameWindow.open());
    view.GuiView view = new view.GuiView();
    controller.GuiController controller = new controller.GuiController(project, view);
    controller.initialize();
    project.printState();
    return null;
}