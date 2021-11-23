public void switchToProjectsView() {
    if ((com.google.appinventor.client.Ode.currentView) != (com.google.appinventor.client.Ode.PROJECTS)) {
        com.google.appinventor.client.boxes.ProjectListBox.getProjectListBox().getProjectList().getSelectedProjects().clear();
        com.google.appinventor.client.boxes.ProjectListBox.getProjectListBox().getProjectList().refreshTable(false);
    }
    com.google.appinventor.client.Ode.currentView = com.google.appinventor.client.Ode.PROJECTS;
    getTopToolbar().updateFileMenuButtons(com.google.appinventor.client.Ode.currentView);
    deckPanel.showWidget(projectsTabIndex);
    projectToolbar.enableStartButton();
}