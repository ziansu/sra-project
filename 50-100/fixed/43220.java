private parser.Command searchTask(java.lang.String input) {
    try {
        if (!(input.contains(" "))) {
            return null;
        }
        input = input.substring(((input.indexOf(" ")) + 1)).trim();
        parser.CreateCmd createCmd = new parser.CreateCmd();
        return createCmd.createSearchCommand(input);
    } catch (java.lang.Exception e) {
        return null;
    }
}