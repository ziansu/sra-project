@java.lang.Override
public void discard() {
    model.player.Resources resourceHand = new model.player.Resources(woodDiscardAmount, sheepDiscardAmount, wheatDiscardAmount, brickDiscardAmount, oreDiscardAmount);
    model.ModelFacade.getInstance().discardCards(resourceHand);
    this.getDiscardView().closeModal();
    this.getDiscardView().setDiscardButtonEnabled(false);
    woodDiscardAmount = 0;
    sheepDiscardAmount = 0;
    wheatDiscardAmount = 0;
    brickDiscardAmount = 0;
    oreDiscardAmount = 0;
    discarded = true;
    model.ModelFacade.getInstance().updateGameModel();
}