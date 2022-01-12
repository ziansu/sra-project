public void addAlias(java.lang.String command, java.lang.String alias) throws seedu.ezdo.commons.exceptions.AliasAlreadyInUseException, seedu.ezdo.commons.exceptions.CommandDoesNotExistException {
    if (seedu.ezdo.commons.util.CommandUtil.isExistingCommand(alias)) {
        throw new seedu.ezdo.commons.exceptions.AliasAlreadyInUseException();
    }
    if (!(seedu.ezdo.commons.util.CommandUtil.isExistingCommand(command))) {
        throw new seedu.ezdo.commons.exceptions.CommandDoesNotExistException();
    }
    commandAliasesMap.put(alias, command);
}