@org.testng.annotations.Test
public void getDeck() throws java.lang.Exception {
    int deckNumber = 0;
    FourRowSolitaire.Deck target = new FourRowSolitaire.Deck(deckNumber);
    java.util.LinkedList<java.lang.Object> actual = target.getDeck();
    java.util.LinkedList<java.lang.Object> expected = null;
    assertTrue(actual.equals(expected));
}