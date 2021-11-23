private dooyit.logic.commands.Command getSingleTypeMoveCommand() {
    return dooyit.logic.commands.CommandUtils.createSetCategoryCommand(taskIdForTagging, dooyit.parser.MoveParser.catName);
}