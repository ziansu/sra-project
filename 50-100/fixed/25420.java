public void actionPerformed(final java.awt.event.ActionEvent event) {
    pvLoggerID = PV_LOG_CHOOSER.getPVLogId();
    if ((pvLoggerID) != 0) {
        pvLoggerDataSource = new xal.service.pvlogger.sim.PVLoggerDataSource(pvLoggerID);
        MODEL.configPVLoggerData(pvLoggerDataSource, pvLoggerID, USE_PVLOGGER.isSelected());
    }
    MODEL.modelScenarioChanged();
    setHasChanges(true);
}