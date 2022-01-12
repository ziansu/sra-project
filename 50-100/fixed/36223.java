private void buildComboProjects() {
    cboProject.removeAllItems();
    cboProject.addItem((-1));
    cboProject.setItemCaption((-1), "MeerkatSys(Empresa)");
    java.util.Collection<entities.Project> projects = controllers.ProjectController.getProjects();
    for (entities.Project aux : projects) {
        cboProject.addItem(aux.getId());
        cboProject.setItemCaption(aux.getId(), aux.getName());
    }
}