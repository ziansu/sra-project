@javafx.fxml.FXML
protected void initialize() {
    simulatorSettings = new ppcSim.gui.SimulatorSettings();
    substationSettings = new ppcSim.gui.SubstationSettings();
    inverterSettings = new ppcSim.gui.InverterSettings();
    sunSettings = new ppcSim.gui.SunSettings();
    controllerSettings = new ppcSim.gui.ControllerSettings();
    setPointSettings = new ppcSim.gui.SetPointSettings();
    setupSimulatorSettingsTab();
    setupIrradianceSettingsTab();
    setupSetPointSettingsTab();
    setupControllerSettingsTab();
    setupAnalysisSettingsTab();
    runSim();
}