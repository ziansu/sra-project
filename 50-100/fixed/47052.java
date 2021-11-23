@org.junit.Test
public void testTie() {
    table = new edu.ucsb.cs56.projects.games.poker.TableCards(aceSpade, threeDiamond, sevenHeart, queenClub, jackClub);
    hand1 = new edu.ucsb.cs56.projects.games.poker.Hand(tenDiamond, tenSpade);
    player1 = new edu.ucsb.cs56.projects.games.poker.Player(hand1);
    hand2 = new edu.ucsb.cs56.projects.games.poker.Hand(tenHeart, tenClub);
    player2 = new edu.ucsb.cs56.projects.games.poker.Player(hand2);
    comparingHands = new edu.ucsb.cs56.projects.games.poker.CompareHands(player1, player2, table);
    org.junit.Assert.assertEquals(2, comparingHands.compareHands());
}