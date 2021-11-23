private void fillAssignment() {
    box_Assignment.removeAllItems();
    java.sql.ResultSet assignments = db.getColumn("select * from assignment");
    try {
        while (assignments.next()) {
            box_Assignment.addItem(assignments.getString("Name"));
        } 
    } catch (java.lang.Exception e) {
        javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
    }
}