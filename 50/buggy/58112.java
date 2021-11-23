public java.lang.Boolean isValid(java.lang.String command) {
    java.lang.System.out.print(("ChangeCommands" + (changeCommands)));
    java.lang.System.out.print(("isvalid " + (changeCommands.containsKey(command))));
    return changeCommands.containsKey(command);
}