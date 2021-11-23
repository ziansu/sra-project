public org.scify.memori.card.CategorizedCard getCardFromLabelAndType(java.lang.String cardLabel, java.lang.String cardCategory) {
    if (org.scify.memori.card.MemoriCardService.cards.isEmpty()) {
        org.scify.memori.card.MemoriCardService.cards = getAllCards();
    }
    for (org.scify.memori.card.Card card : org.scify.memori.card.MemoriCardService.cards) {
        org.scify.memori.card.CategorizedCard categorizedCard = ((org.scify.memori.card.CategorizedCard) (card));
        if ((categorizedCard.getLabel().equals(cardLabel)) && (categorizedCard.getCategory().equals(cardCategory)))
            return categorizedCard;
        
    }
    return null;
}