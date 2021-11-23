private void LoadGui() throws java.lang.Exception {
    if (FirstTime()) {
        ShowDisclaimer();
    }else {
        dpfmanager.MainApp.gui = new dpfmanager.shell.modules.interfaces.Gui();
        dpfmanager.MainApp.gui.LoadConformanceChecker();
        ShowMain();
    }
}