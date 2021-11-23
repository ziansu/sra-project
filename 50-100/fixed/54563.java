public void actionPerformed(final java.awt.event.ActionEvent event) {
    if (USE_LOGGEDBEND.isSelected()) {
        if ((pvLoggerDataSource) != null)
            pvLoggerDataSource.setUsesLoggedBendFields(true);
        
    }else {
        if ((pvLoggerDataSource) != null)
            pvLoggerDataSource.setUsesLoggedBendFields(false);
        
    }
    setHasChanges(true);
}