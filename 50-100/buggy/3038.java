@org.junit.Test
public void testGetDeck() {
    java.lang.System.out.println("getDeck");
    Mighty_Cards.Player testPlayer = new Mighty_Cards.Player("testName", "testPass");
    Mighty_Cards.Match testMatch = new Mighty_Cards.Match(testPlayer);
    Mighty_Cards.Deck testDeck = new Mighty_Cards.Deck();
    Mighty_Cards.Hero testHero = new Mighty_Cards.Hero(testMatch, testPlayer, testDeck);
    Mighty_Cards.Deck expResult = null;
    Mighty_Cards.Deck result = testHero.getDeck();
    assertEquals(expResult, result);
}