private static void setUp() {
    if (!(gui.model.FormatErrorHandler.initialized)) {
        gui.model.FormatErrorHandler.tree = new java.util.TreeSet<java.lang.String>();
        try {
            gui.model.FormatErrorHandler.conf = new java.util.Properties();
            gui.model.FormatErrorHandler.conf.load(new java.io.FileReader(new java.io.File("RegistrationData/registration.properties")));
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        gui.model.FormatErrorHandler.initialized = true;
    }
}