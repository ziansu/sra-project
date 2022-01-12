private parser.Command deleteTask(java.lang.String input) {
    try {
        input = input.substring(((input.indexOf(" ")) + 1)).trim();
        int index = java.lang.Integer.parseInt(input);
        parser.CreateCmd createCmd = new parser.CreateCmd();
        return createCmd.createDeleteCommand(index);
    } catch (java.lang.Exception e) {
        return null;
    }
}