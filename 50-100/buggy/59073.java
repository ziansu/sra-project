@java.lang.Override
public void discard() {
    client.state.IStateBase state = this.stateManager.getState();
    toDiscard.setBrick(currBrick);
    toDiscard.setOre(currOre);
    toDiscard.setSheep(currSheep);
    toDiscard.setWheat(currWheat);
    toDiscard.setWood(currWood);
    alreadyDiscarding = false;
    state.discard(toDiscard);
    waiting = true;
    getDiscardView().closeModal();
    waitView.setMessage("Waiting for other players to discard");
    waitView.showModal();
}