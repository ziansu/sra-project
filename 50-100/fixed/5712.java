private void checkAutoRefreshActionPerformed(java.awt.event.ActionEvent evt) {
    if (checkAutoRefresh.isSelected()) {
        cbAutoRefreshInterval.setEnabled(false);
        btnRefresh.setEnabled(false);
        java.lang.String time_value = java.lang.String.valueOf(cbAutoRefreshInterval.getSelectedItem());
    }else {
        cbAutoRefreshInterval.setEnabled(true);
        btnRefresh.setEnabled(true);
    }
}