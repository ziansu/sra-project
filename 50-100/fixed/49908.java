@org.junit.Test
public void testisOnePairLoses() {
    table = new edu.ucsb.cs56.projects.games.poker.TableCards(fiveSpade, twoHeart, kingClub, nineDiamond, jackHeart);
    hand1 = new edu.ucsb.cs56.projects.games.poker.Hand(fiveDiamond, sixSpade);
    player1 = new edu.ucsb.cs56.projects.games.poker.Player(hand1);
    hand2 = new edu.ucsb.cs56.projects.games.poker.Hand(queenSpade, tenHeart);
    player2 = new edu.ucsb.cs56.projects.games.poker.Player(hand2);
    comparingHands = new edu.ucsb.cs56.projects.games.poker.CompareHands(player1, player2, table);
    org.junit.Assert.assertEquals(0, comparingHands.compareHands());
}