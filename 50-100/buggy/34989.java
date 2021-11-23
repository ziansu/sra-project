@java.lang.Override
public main.State execute(main.State completeState) throws java.io.IOException, json.JSONException {
    this.completeState = completeState;
    completeState.clearSelections();
    java.util.ArrayList<main.GenericEvent> allEvents = completeState.getAllEvents();
    if (selectByIndex) {
        selectViaIndex();
    }else {
        getMatchingEvents(allEvents);
        checkSelectionStatus();
    }
    return null;
}