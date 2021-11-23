private void displayAdmProject() {
    java.lang.String role = mainApp.projectDAO.findRole(mainApp.getMyUser().getUserId(), mainApp.getMyProject().getProjectId());
    if (role.equals("Chef de projet")) {
        deleteProject.setVisible(true);
        startUpdateProject.setVisible(true);
    }
}