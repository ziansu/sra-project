private void truncate_backlog_btnActionPerformed(java.awt.event.ActionEvent evt) {
    com.mergano.gui.BacklogDAO daobl = new com.mergano.gui.BacklogDAO();
    daobl.truncateBacklog();
    updateBacklog(daobl.getBacklogData());
}