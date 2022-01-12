private void remove(sg.edu.nus.eydis.controller.InputParser parser) {
    try {
        if (parser.hasIndexList()) {
            _tasks.remove(parser.getIndexList());
            commandMessage = "Tasks successfully removed";
            commandStatus = true;
        }
    } catch (java.lang.IndexOutOfBoundsException e) {
        commandMessage = "Tasks not removed, input error.";
        commandStatus = true;
    }
    commandResults = getAllTasks();
}