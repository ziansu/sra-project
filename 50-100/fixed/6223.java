@java.lang.Override
protected void internalDraw(java.awt.Graphics g) {
    ca.claytonrogers.Common.IntVector offsetLocation = new ca.claytonrogers.Common.IntVector(location);
    offsetLocation = offsetLocation.add(Constants.DECK_OFFSET);
    ca.claytonrogers.Common.Card bottomCard = new ca.claytonrogers.Common.Card((-1), true);
    ca.claytonrogers.Common.Card topCard = new ca.claytonrogers.Common.Card(deck.peek().value, isFaceUp);
    ca.claytonrogers.Client.GUIObjects.Drawer.drawCard(g, bottomCard, offsetLocation);
    ca.claytonrogers.Client.GUIObjects.Drawer.drawCard(g, topCard, location);
}