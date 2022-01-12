@java.lang.Override
public void runInvokerLoop() {
    while (!(stopLoop)) {
        java.lang.String userInput = null;
        try {
            userInput = readUserInput();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        if (userInput == null) {
            stopLoop = true;
        }
        fr.istic.nplouzeau.simplecommands.Command cmdToExecute = commands.get(userInput);
        if (cmdToExecute != null) {
            cmdToExecute.execute();
        }
    } 
}