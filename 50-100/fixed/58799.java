public boolean exitApplication() {
    if (de.uni_hannover.sra.minimax_simulator.Main.getWorkspace().isUnsaved()) {
        javafx.scene.control.ButtonType choice = new de.uni_hannover.sra.minimax_simulator.gui.FXUnsavedDialog(_res.get("close-project.exit.title"), _res.get("close-project.exit.message")).getChoice();
        if (choice.equals(javafx.scene.control.ButtonType.YES)) {
            if (!(saveConfirmed())) {
                return false;
            }
        }else
            if (choice.equals(javafx.scene.control.ButtonType.CANCEL)) {
                return false;
            }
        
    }
    javafx.application.Platform.exit();
    return true;
}