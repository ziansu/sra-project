public void EmptyCard() {
    Cards c;
    do {
        c = CardManager.GetCard(CardType.GreenCards);
        if (c == null)
            CardManager.GetCard(CardType.BrownCards);
        
    } while (c != null );
}