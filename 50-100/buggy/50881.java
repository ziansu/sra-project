private void run(sg.edu.nus.eydis.controller.InputParser inputParser) {
    java.lang.String keyname = inputParser.getKeyName();
    java.lang.String command = _config.getStoredCommand(keyname);
    if (command != null) {
        _commandMessage = java.lang.String.format(sg.edu.nus.eydis.controller.Eydis.MESSAGE_RUN_SUCCESS, command);
        executeCommand(new sg.edu.nus.eydis.controller.InputParser(command));
    }else {
        _commandMessage = java.lang.String.format(sg.edu.nus.eydis.controller.Eydis.MESSAGE_RUN_FAILED, keyname);
        _commandSuccess = false;
        _commandResults = getAllTasks();
    }
}