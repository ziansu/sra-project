public void highlightCurrentTagName(java.util.Set<java.lang.String> keywords) {
    int index = seedu.address.model.TaskManager.getInstance().find(keywords.toString());
    if (index != (-1)) {
        seedu.address.commons.core.EventsCenter.getInstance().post(new seedu.address.commons.events.ui.JumpToTagListRequestEvent((index - 1)));
    }
}