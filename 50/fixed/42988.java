public void actionPerformed(java.awt.event.ActionEvent event) {
    game.getRoster().getTeam(model.getValueAt(selectedRow, 1)).unregisterStudent(model.getStudentAt(selectedRow));
}