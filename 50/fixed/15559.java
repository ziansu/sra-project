public void EmptyCard() {
    Cards c;
    do {
        c = CardManager.GetCard(CardType.GreenCards);
    } while (c != null );
}