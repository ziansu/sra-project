private parser.Command markTask(java.lang.String input) {
    try {
        if (!(input.contains(" "))) {
            return null;
        }
        input = input.substring(((input.indexOf(" ")) + 1)).trim();
        int i = java.lang.Integer.parseInt(input);
        parser.CreateCmd markcmd = new parser.CreateCmd();
        return markcmd.createMarkCommand(i);
    } catch (java.lang.Exception e) {
        return null;
    }
}