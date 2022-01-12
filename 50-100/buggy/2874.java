@java.lang.Override
public boolean isValidCommandWord(java.lang.String commandWord) {
    java.lang.String lowerStr = commandWord.toLowerCase();
    if ((lowerStr == (seedu.jimi.logic.commands.RedoCommand.COMMAND_WORD.toLowerCase())) || (lowerStr == (seedu.jimi.logic.commands.RedoCommand.SHORT_COMMAND_WORD.toLowerCase()))) {
        return true;
    }
    return false;
}