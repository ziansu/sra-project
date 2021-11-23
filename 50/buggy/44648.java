@java.lang.Override
protected void showDiceRollResult(com.monopoly.logic.events.Event event) {
    monopolBoard.showMessageToPlayer(event.getEventMessage());
}