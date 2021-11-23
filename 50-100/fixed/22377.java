private parser.Command deleteTask(java.lang.String input) {
    try {
        if (input.contains(" ")) {
            input = input.substring(((input.indexOf(" ")) + 1)).trim();
            int index = java.lang.Integer.parseInt(input);
            parser.CreateCmd createCmd = new parser.CreateCmd();
            return createCmd.createDeleteCommand(index);
        }else {
            return null;
        }
    } catch (java.lang.Exception e) {
        return null;
    }
}