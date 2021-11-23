public void act() {
    if ((game.DragonLand.coins) > (d.getPrice())) {
        if ((((game.shopScreen.SellScreenInterface) (DragonLand.sellScreen)).getDragonsInSellShop().size()) < 6) {
            boughtDragon(d, label);
            removeDragons();
            addLabels(visible);
        }else {
            addError("You have already maxed out your inventory. Go sell a dragon before buying another");
        }
    }else {
        addError("You do not have enough coins. Go play our minigame to win more coins");
        java.lang.System.out.println((("You donot have enough coins. Go play our minigame to win more coins You have " + (game.DragonLand.coins)) + " coins"));
    }
}