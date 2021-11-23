public MySolitaire.Card pop() {
    MySolitaire.Card result = null;
    if ((firstCard) != null) {
        result = firstCard;
        firstCard = firstCard.link;
    }
    (_card_count)--;
    return result;
}