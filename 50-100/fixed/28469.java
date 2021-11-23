@java.lang.Override
public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
    at.sunplugged.z600.gui.dialogs.ValueDialog valueDialog = new at.sunplugged.z600.gui.dialogs.ValueDialog("Choose distance to stop at.", "Decide at which position the conveyor should stop automatically in [m]", (-(java.lang.Double.MAX_VALUE)), java.lang.Double.MAX_VALUE, group.getShell());
    if ((valueDialog.open()) == (at.sunplugged.z600.gui.dialogs.ValueDialog.Answer.OK)) {
        at.sunplugged.z600.gui.factorys.ConveyorGroupFactory.conveyorMonitor.setStopMode(StopMode.DISTANCE_REACHED);
        at.sunplugged.z600.gui.factorys.ConveyorGroupFactory.conveyorMonitor.setStopPosition(valueDialog.getValue());
        at.sunplugged.z600.gui.factorys.ConveyorGroupFactory.updateInfoLabelConveyorMonitor(infoLabel);
    }
}