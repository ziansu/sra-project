@java.lang.Override
protected void initScreen() {
    initColors();
    game.DragonLand.homeScreen = new game.HomeScreen(getWidth(), getHeight());
    game.DragonLand.shopMain = new game.HomeShopScreen(getWidth(), getHeight());
    game.DragonLand.buyScreen = new game.BuyScreenWendy(getWidth(), getHeight());
    setScreen(game.DragonLand.homeScreen);
}