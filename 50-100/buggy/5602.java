public void valueChanged(javax.swing.event.ListSelectionEvent e) {
    boolean enabled = !(prjTablePanel.projectsTable.getModel().getValueAt(prjTablePanel.projectsTable.getSelectedRow(), ProjectsTablePanel.PROJECT_ID).toString().equals(net.sf.memoranda.CurrentProject.get().getID()));
    ppDeleteProject.setEnabled(enabled);
    ppOpenProject.setEnabled(enabled);
    ppProperties.setEnabled(true);
}