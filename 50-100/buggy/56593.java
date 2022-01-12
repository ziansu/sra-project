@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    checkFields(textFieldName, textFieldSupervisor, textAreaDescription);
    if (((boolName) && (boolSupervisor)) && (boolDescription)) {
        project.setName(textFieldName.getText());
        project.setSupervisor(textFieldSupervisor.getText());
        project.setDescription(textAreaDescription.getText());
        panel.refreshData();
        dialogProject.dispose();
    }
}