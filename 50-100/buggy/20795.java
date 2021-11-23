private void fillAssignment() {
    box_Assignment.removeAllItems();
    java.sql.ResultSet assignments = db.getColumn("select * from assignment");
    int numOfAssignments;
    try {
        numOfAssignments = db.getCount("assignment");
        for (int i = 0; i < numOfAssignments; i++) {
            assignments.next();
            box_Assignment.addItem(assignments.getString("Name"));
        }
    } catch (java.lang.Exception e) {
        javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
    }
}