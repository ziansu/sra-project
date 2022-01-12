private parser.Command addTask(java.lang.String input) {
    if (input.contains(" ")) {
        input = input.substring(((input.indexOf(" ")) + 1)).trim();
        parser.TaskBuilder extractor = new parser.TaskBuilder(input);
        parser.Task t = extractor.extractAddCommand();
        parser.CreateCmd createCmd = new parser.CreateCmd();
        return createCmd.createAddCommand(t);
    }else {
        return null;
    }
}