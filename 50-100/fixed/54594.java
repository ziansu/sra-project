@java.lang.Override
public void mouseClicked(java.awt.event.MouseEvent e) {
    ee.bha.ComponentsTableModel model = ((ee.bha.ComponentsTableModel) (componentsList.getModel()));
    try {
        model.removeComponentsRows(componentsList.getSelectedRows());
    } catch (java.sql.SQLException e1) {
        e1.printStackTrace();
        java.lang.System.out.println("Some error in delete button listener!");
    }
}