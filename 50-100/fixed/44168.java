@java.lang.Override
public void run() {
    try {
        de.uni_hannover.sra.minimax_simulator.Main.getWorkspace().openProject(file);
        initProjectGUI();
    } catch (de.uni_hannover.sra.minimax_simulator.io.ProjectImportException e) {
        closeProject();
        de.uni_hannover.sra.minimax_simulator.ui.UI.invokeInFAT(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                new de.uni_hannover.sra.minimax_simulator.gui.FXDialog(javafx.scene.control.Alert.AlertType.ERROR, _res.get("load-error.title"), _res.get("load-error.message")).showAndWait();
            }
        });
    }
}