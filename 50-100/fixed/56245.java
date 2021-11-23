public void actionPerformed(final java.awt.event.ActionEvent event) {
    if ((PV_LOG_CHOOSER.getPVLogId()) != 0) {
        if ((pvLoggerID) != (PV_LOG_CHOOSER.getPVLogId()))
            pvLoggerDataSource = new xal.service.pvlogger.sim.PVLoggerDataSource(PV_LOG_CHOOSER.getPVLogId());
        
        MODEL.configPVLoggerData(pvLoggerDataSource, PV_LOG_CHOOSER.getPVLogId(), USE_PVLOGGER.isSelected());
        pvLoggerID = PV_LOG_CHOOSER.getPVLogId();
    }
    MODEL.modelScenarioChanged();
    setHasChanges(true);
}