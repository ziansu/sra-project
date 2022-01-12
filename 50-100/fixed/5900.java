@org.junit.Test
public void makeAValidTableauMoveForASingleCard() {
    klondike.addToTableauPile(0, new kata.houseofcards.Card(13, CLUBS));
    klondike.getTableauPile(1).push(new kata.houseofcards.Card(13, DIAMONDS));
    klondike.addToTableauPile(1, new kata.houseofcards.Card(12, DIAMONDS));
    klondike.makeMove();
    org.assertj.core.api.Assertions.assertThat(klondike.getTableauPile(0)).hasSize(2);
    org.assertj.core.api.Assertions.assertThat(klondike.getTableauPile(1)).hasSize(1);
}