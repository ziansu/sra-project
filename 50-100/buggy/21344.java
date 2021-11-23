public seedu.tache.logic.commands.Command parse(java.lang.String args) {
    java.lang.String trimmedArgs = args.trim();
    if (!(trimmedArgs.equals(""))) {
        switch (trimmedArgs) {
            case seedu.tache.logic.parser.CliSyntax.COMPLETED_FILTER :
            case seedu.tache.logic.parser.CliSyntax.UNCOMPLETED_FILTER :
            case seedu.tache.logic.parser.CliSyntax.ALL_FILTER :
                return new seedu.tache.logic.commands.ListCommand(args);
            default :
                return new seedu.tache.logic.commands.IncorrectCommand(java.lang.String.format(seedu.tache.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT, ListCommand.MESSAGE_USAGE));
        }
    }else {
        return new seedu.tache.logic.commands.ListCommand();
    }
}