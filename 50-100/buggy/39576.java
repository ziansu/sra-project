@java.lang.Override
public void init(org.newdawn.slick.GameContainer container) throws org.newdawn.slick.SlickException {
    ca.concordia.lanternsentities.Game game = client.getGame();
    cardStacks = new ca.concordia.lanterns_slick2d.ui.CardStacksView(true, CARDS_X, CARDS_Y);
    cardStacks.init(container);
    favors = new ca.concordia.lanterns_slick2d.ui.buttons.FavorToken(container, FAVORS_X, FAVORS_Y);
    tileStack = new ca.concordia.lanterns_slick2d.ui.buttons.Tile(container, TILE_BACK_IMG, TILE_STACK_X, TILE_STACK_Y);
    initPlayers(game, container);
    initLake(game, container);
}