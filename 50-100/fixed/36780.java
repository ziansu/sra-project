private void setInitialCardsInHand() {
    for (int i = 0; i < (handButtons.length); ++i) {
        java.lang.String colorAndTypeOfCard = controller.getCardColorAndTypeFromHand(i);
        int cardImageResourceId = getCardImageResourceId(colorAndTypeOfCard);
        com.squareup.picasso.Picasso.with(this).load(cardImageResourceId).fit().into(handButtons[i]);
    }
}