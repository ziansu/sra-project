@java.lang.Override
public void addCard(final solitaire.Card aCard) {
    super.addCard(aCard);
    (this.activeCards)++;
    java.lang.System.out.println((((this) + " ") + (activeCards)));
}