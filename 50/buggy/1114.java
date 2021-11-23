@java.lang.Override
public void buttonClick(org.freelo.view.ProjectManagement.Button.ClickEvent event) {
    createNewSprint = new org.freelo.view.ProjectManagement.addSprintWindow(nextcontainer);
    org.freelo.view.ProjectManagement.UI.getCurrent().addWindow(createNewSprint);
}