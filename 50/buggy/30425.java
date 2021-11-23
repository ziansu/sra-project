private void finalizeHeat() {
    replicatorg.app.Base.writeLog("Cooling down...");
    machine.runCommand(new replicatorg.app.ui.panels.SetTemperature(0));
}