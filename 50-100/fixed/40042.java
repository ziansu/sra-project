@java.lang.Override
public seedu.gtd.logic.commands.CommandResult execute() {
    model.updateFilteredTaskList(keywords, keywordSet);
    if (model.getFilteredTaskList().isEmpty()) {
        model.updateFilteredTaskList(keywordSet);
        if (!(model.getFilteredTaskList().isEmpty()))
            return new seedu.gtd.logic.commands.CommandResult(getMessageForTaskListShownSummaryIfExactPhraseNotFound());
        
    }
    return new seedu.gtd.logic.commands.CommandResult(getMessageForTaskListShownSummary(model.getFilteredTaskList().size()));
}