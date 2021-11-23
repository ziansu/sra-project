public com.libertymutual.goforcode.blackjackpractice.models.Card drawCard() {
    com.libertymutual.goforcode.blackjackpractice.models.Card card;
    if ((deck.size()) > 0) {
        card = deck.get(((deck.size()) - 1));
        deck.remove(((deck.size()) - 1));
    }else {
        java.lang.System.out.println("The deck ran out of cards!");
        return null;
    }
    return card;
}