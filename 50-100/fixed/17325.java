private static void setUp() {
    if ((gui.model.FormatErrorHandler.tree) == null) {
        gui.model.FormatErrorHandler.tree = new java.util.TreeSet<java.lang.String>();
    }
    if ((gui.model.FormatErrorHandler.conf) == null) {
        try {
            gui.model.FormatErrorHandler.conf = new java.util.Properties();
            gui.model.FormatErrorHandler.conf.load(new java.io.FileReader(new java.io.File("RegistrationData/registration.properties")));
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}