@Test
public void canDealOutCards() {
    game.clearDeck();
    game.fullDeck();
    game.addToPlayers(player1);
    game.addToPlayers(player2);
    game.dealOut();
    assertEquals(2, player1.handCount());
    assertEquals(2, player2.handCount());
}