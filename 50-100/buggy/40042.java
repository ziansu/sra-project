@java.lang.Override
public seedu.gtd.logic.commands.CommandResult execute() {
    model.updateFilteredTaskList(keywords);
    if (model.getFilteredTaskList().isEmpty()) {
        model.updateFilteredTaskList(keywordSet);
        return new seedu.gtd.logic.commands.CommandResult(getMessageForTaskListShownSummaryIfExactPhraseNotFound(model.getFilteredTaskList().size()));
    }
    return new seedu.gtd.logic.commands.CommandResult(getMessageForTaskListShownSummary(model.getFilteredTaskList().size()));
}