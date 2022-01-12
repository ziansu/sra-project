private void dropCoin(logic.BouncingCircle circle) {
    boolean bigMoney = random.nextBoolean();
    logic.Coin someCoin = new logic.Coin(circle.getCenterX(), circle.getCenterY(), bigMoney);
    droppedCoins.add(someCoin);
    if (mainGame.isLanMultiplayer()) {
        mainGame.getHost().updateCoinsAdd(someCoin);
    }
}