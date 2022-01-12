@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    checkFields();
    if (((boolName.get()) && (boolSupervisor.get())) && (boolDescription.get())) {
        project.setName(textFieldName.getText());
        project.setSupervisor(textFieldSupervisor.getText());
        project.setDescription(textAreaDescription.getText());
        panel.refreshData();
        dialogProject.dispose();
    }
}