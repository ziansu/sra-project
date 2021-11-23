private dooyit.logic.commands.Command getSingleTypeMoveCommand() {
    java.lang.System.out.println(("taskIdForMoving is " + (taskIdForTagging)));
    return dooyit.logic.commands.CommandUtils.createSetCategoryCommand(taskIdForTagging, dooyit.parser.MoveParser.catName);
}