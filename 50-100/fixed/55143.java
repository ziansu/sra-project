public winter.views.project.ProjectNodeView addNewFile(java.nio.file.Path path) {
    winter.models.projects.ProjectModel fileProjectModel = new winter.models.projects.ProjectModelImpl(path);
    winter.views.project.ProjectController fileProjectController = new winter.views.project.FileProjectController(fileProjectModel, projectController.getProjectSetController(), projectController.getEditorSetController());
    winter.views.project.ProjectNodeView fileNode = fileProjectController.getProjectNodeView();
    fileNode.setGraphic(winter.Resources.getIcon("file.png"));
    fileProjectController.start();
    insertNode(fileNode);
    return fileNode;
}