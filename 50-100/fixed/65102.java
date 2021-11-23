@java.lang.Override
public void initialize(java.net.URL url, java.util.ResourceBundle rb) {
    game.HoverMouse.inHover(fight);
    game.HoverMouse.outHover(fight);
    game.HoverMouse.inHover(inn);
    game.HoverMouse.outHover(inn);
    game.HoverMouse.inHover(shop);
    game.HoverMouse.outHover(shop);
    game.HoverMouse.inHover(menu);
    game.HoverMouse.outHover(menu);
    game.DataStorage.getInstance().printHero();
}