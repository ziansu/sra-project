public static void registerPanel() throws exceptions.DBException {
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
        }
    }else
        if (registerClickResponse == 1)
            controller.facade.GuiFacade.start();
        else
            java.lang.System.exit(0);
        
    
}