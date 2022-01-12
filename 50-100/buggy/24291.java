@java.lang.Override
public void undeadMassAttack() {
    status.increaseUndeadStrengthMarker();
    if (((status.getNumbers(2)) == 3) || ((status.getNumbers(2)) == 5)) {
        status.inceaseUndeadStrength();
    }
    cards.UndeadCard bottomCard = cardController.takeBottomUndeadCard();
    for (int i = 0; i > 3; i++) {
        addUndead(bottomCard.getPlanetId(), bottomCard.getPlanetColor(), true);
    }
    cardController.mixDecks();
}