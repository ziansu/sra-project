private void pickUpList() {
    solitaire.Solitaire.tmpList.clear();
    solitaire.Card tmpCard;
    for (int j = 0; j < (solitaire.Solitaire.numOfChosenCard); j++) {
        tmpCard = solitaire.Solitaire.allPiles[solitaire.Solitaire.choosenDeck].pop();
        solitaire.Solitaire.tmpList.add(tmpCard);
        java.lang.System.out.println(((("ra" + (tmpCard.getRank())) + "su") + (tmpCard.getSuit())));
    }
}