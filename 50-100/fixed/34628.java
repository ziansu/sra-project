public com.mygdx.game.OneCard getPairsHead(java.util.LinkedList<com.mygdx.game.OneCard> withCard) {
    if (((withCard.size()) == 2) && ((withCard.get(0).getValue()) == (withCard.get(1).getValue()))) {
        return withCard.get(1);
    }
    return null;
}