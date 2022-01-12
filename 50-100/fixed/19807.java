protected void drawQueue(android.graphics.Canvas canvas) {
    float paddingLeft = (getWidth()) - ((cardWidth) * (1 + ((fieldsOffsetInCards) / 2)));
    float paddingTop = ((cardHeight) * (fieldsOffsetInCards)) / 2;
    for (int card : player.getCardsFromQueue()) {
        drawCard(canvas, paddingLeft, paddingTop, card);
        paddingTop += (cardHeight) * (1 + ((fieldsOffsetInCards) / 2));
    }
}