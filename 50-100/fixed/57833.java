static int getCommand(java.lang.String prompt, int waiterID) throws java.io.IOException {
    if (((com.musicbox.Utils.lastID) == waiterID) && ((com.musicbox.Utils.lastID) != (-1))) {
        return com.musicbox.Utils.lastCommand;
    }else {
        com.musicbox.Utils.lastCommand = -1;
        com.musicbox.Utils.lastID = -1;
        int command = com.musicbox.Utils.waitForCommand(prompt);
        if ((command % 2) == 0) {
            com.musicbox.Utils.lastCommand = command - 1;
            com.musicbox.Utils.lastID = waiterID;
            return com.musicbox.Utils.lastCommand;
        }else {
            return command;
        }
    }
}