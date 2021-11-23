public static boolean registerPanel() throws exceptions.DBException {
    int registerClickResponse = gui.factory.FactoryDialog.registerGUIDialog();
    if (registerClickResponse == 0) {
        controller.ddbb.dto.UserDTO registerUser = controller.functions.LogFunctions.getUserInput(true);
        if (registerUser != null) {
            try {
                registerUser.registerUser();
            } catch (exceptions.DBException e) {
                java.lang.System.out.println(e);
                java.lang.System.exit((-1));
            }
            controller.functions.LogFunctions.start(registerUser);
            return true;
        }
    }
    return false;
}