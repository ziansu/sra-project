public boolean isSubSubCommand(java.lang.String subSubCommand) {
    if (subSubCommand == null)
        return false;
    
    return subSubCommand.equalsIgnoreCase(this.subSubCommand);
}