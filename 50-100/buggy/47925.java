private void addCoin(java.lang.String[] stringList) {
    gameState.getDroppedCoins().add(new logic.Coin(java.lang.Float.parseFloat(stringList[0]), java.lang.Float.parseFloat(stringList[1]), java.lang.Boolean.parseBoolean(stringList[2])));
}