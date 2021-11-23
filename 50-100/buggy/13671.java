@org.junit.Test
public void testisFourOfAKindWins() {
    table = new edu.ucsb.cs56.projects.games.poker.TableCards(aceSpade, aceHeart, tenHeart, threeClub, jackHeart);
    hand1 = new edu.ucsb.cs56.projects.games.poker.Hand(aceDiamond, aceClub);
    player1 = new edu.ucsb.cs56.projects.games.poker.Player(hand1);
    hand2 = new edu.ucsb.cs56.projects.games.poker.Hand(threeSpade, threeDiamond);
    player2 = new edu.ucsb.cs56.projects.games.poker.Player(hand2);
    comparingHands = new edu.ucsb.cs56.projects.games.poker.CompareHands(player1, player2, table);
    org.junit.Assert.assertEquals(comparingHands.compareHands(), 1);
}