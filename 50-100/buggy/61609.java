public void addToUndeterminedList() {
    if ((modifiedEvent.getCategory()) == (main.GenericEvent.Category.FLOATING)) {
        completeState.setStatusMessage(State.MESSAGE_ATTEMPTED_ADD_WITH_RESERVE);
        completeState.hasErrorMessage = true;
    }else {
        completeState.addToReservedList(((main.ReservedEvent) (modifiedEvent)));
        completeState.addToUndeterminedList(((main.ReservedEvent) (modifiedEvent)));
    }
}