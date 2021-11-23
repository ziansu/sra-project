public static void getWriterFactoryProperties() {
    try {
        ch.ice.view.GUIController.config = new org.apache.commons.configuration.PropertiesConfiguration("conf/app.properties");
        java.lang.String tester = ch.ice.view.GUIController.config.getString("writer.factory");
        if (tester.equals("EXCEL")) {
            ch.ice.controller.MainController.fileWriterFactory = true;
        }else
            if (tester.equals("CSV")) {
                ch.ice.controller.MainController.fileWriterFactory = false;
            }
        
    } catch (org.apache.commons.configuration.ConfigurationException e1) {
        e1.printStackTrace();
    }
}