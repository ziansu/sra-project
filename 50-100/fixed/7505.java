public java.lang.String executeCommand(main.Constants.COMMAND_TYPE command, java.lang.String[] task) {
    try {
        Handler.Command cmd = createCommand(command, task);
        return cmd.execute(task, taskID);
    } catch (java.lang.IllegalArgumentException invalidCommandFormat) {
        return Constants.MESSAGE_INVALID_FORMAT;
    } catch (java.lang.IllegalStateException unrecognizedCommand) {
        return Constants.MESSAGE_UNRECOGN = ZED_COMMAND;
    }
}