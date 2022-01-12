public static java.lang.String getSaveProperties(javafx.scene.control.Button startButton) {
    try {
        ch.ice.view.GUIController.config = new org.apache.commons.configuration.PropertiesConfiguration("conf/app.properties");
        ch.ice.view.GUIController.path = ch.ice.view.GUIController.config.getString("writer.file.path");
        ch.ice.view.GUIController.chosenPath = ch.ice.view.GUIController.config.getString("writer.file.chosenPath");
        if ((ch.ice.controller.MainController.uploadedFileContainingCustomers) == null) {
            startButton.setDisable(true);
        }else
            startButton.setDisable(false);
        
    } catch (org.apache.commons.configuration.ConfigurationException e1) {
        e1.printStackTrace();
        ch.ice.view.GUIController.logger.error(e1);
    }
    return ch.ice.view.GUIController.path;
}