public boolean execute(java.lang.Object caller, java.lang.String... params) {
    if ((!(isAllowed(caller))) || (!(validateParameters(params)))) {
        com.dbegnis.base.command.BaseCommand.log.error("command execution failed: parameters not valid");
        return false;
    }
    return handle(params);
}