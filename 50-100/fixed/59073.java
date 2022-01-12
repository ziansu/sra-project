@java.lang.Override
public void discard() {
    client.state.IStateBase state = this.stateManager.getState();
    toDiscard.setBrick(currBrick);
    toDiscard.setOre(currOre);
    toDiscard.setSheep(currSheep);
    toDiscard.setWheat(currWheat);
    toDiscard.setWood(currWood);
    alreadyDiscarding = false;
    waiting = true;
    state.discard(toDiscard);
    getDiscardView().closeModal();
}