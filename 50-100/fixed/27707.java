boolean revealsTop(ca.mcgill.cs.stg.solitaire.cards.Card pCard, ca.mcgill.cs.stg.solitaire.model.GameModel.StackIndex pIndex) {
    int indexOf = aStacks.get(pIndex).indexOf(pCard);
    if (indexOf < 1) {
        return false;
    }
    return !(aVisible.contains(aStacks.get(pIndex).get((indexOf - 1))));
}