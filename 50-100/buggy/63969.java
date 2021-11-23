@java.lang.Override
public void start(javafx.stage.Stage mainStage) throws java.lang.Exception {
    edu.cis232.gwasos.resources.Map map = new edu.cis232.gwasos.resources.Map();
    int reply = javax.swing.JOptionPane.showConfirmDialog(null, "Do you want to reset the database?", "Reset Prompt", javax.swing.JOptionPane.YES_NO_OPTION);
    if (reply == (javax.swing.JOptionPane.YES_OPTION)) {
        try {
            edu.cis232.gwasos.resources.DatabaseHandler.openConnection();
            edu.cis232.gwasos.resources.DatabaseHandler.dropTables();
        } catch (java.sql.SQLException ex) {
        }
    }
    edu.cis232.gwasos.resources.DatabaseHandler.initialize();
    edu.cis232.gwasos.resources.StartScreen sScreen = new edu.cis232.gwasos.resources.StartScreen();
    edu.cis232.gwasos.resources.GUIHandler guiHandler = new edu.cis232.gwasos.resources.GUIHandler(mainStage, sScreen, map);
}