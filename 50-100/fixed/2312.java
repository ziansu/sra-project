public void sellAProperty(java.lang.String propertyName, java.lang.String buyerName, int cost) {
    venture.cs414.android.monopoly2.backend.Player buyer = getPlayerByName(buyerName);
    venture.cs414.android.monopoly2.backend.Property property = board.getPropertyByName(propertyName);
    if (!(buyer.canAfford(cost))) {
        currentMessage = buyerName + " cannot afford that price!";
    }else {
        currentPlayer.removeFromPropertiesOwned(property);
        buyer.addToPropertiesOwned(property);
        property.setOwner(currentPlayer);
        payPlayer(buyer, currentPlayer, cost);
        currentMessage = "Transaction Successful! :D";
    }
}