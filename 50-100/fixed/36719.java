@org.testng.annotations.Test
public void getDeckLinkedListInteger() throws java.lang.Exception {
    int deckNumber = 0;
    FourRowSolitaire.Deck target = new FourRowSolitaire.Deck(deckNumber);
    java.util.LinkedList<java.lang.Integer> numbers = null;
    java.util.LinkedList<java.lang.Object> actual = target.getDeck(numbers);
    java.util.LinkedList<java.lang.Object> expected = null;
    assertThat(actual, is(equals(expected)));
}