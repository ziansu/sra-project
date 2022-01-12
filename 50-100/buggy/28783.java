protected void drawCard(GameImplementation.Pile deck) {
    if (!(deck.cards.isEmpty())) {
        GameImplementation.Card card = deck.drawTopCard();
        hand.cards.add(card);
        if (!(name.equals("Computer"))) {
            java.lang.System.out.println((((name) + " drew ") + card));
        }else {
            java.lang.System.out.println(((name) + " drew a card"));
        }
    }else {
        java.lang.System.out.println("Cannot draw, draw pile is empty");
    }
}