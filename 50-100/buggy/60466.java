private static java.lang.String resourcesToString(catan.domain.model.game.GameUserBean gameUser, catan.domain.model.game.Resources resources) {
    java.lang.String resourcesList = "";
    catan.services.util.play.MessagesUtil.addResQuantityToList(gameUser, resources, resourcesList, HexType.BRICK);
    catan.services.util.play.MessagesUtil.addResQuantityToList(gameUser, resources, resourcesList, HexType.WOOD);
    catan.services.util.play.MessagesUtil.addResQuantityToList(gameUser, resources, resourcesList, HexType.SHEEP);
    catan.services.util.play.MessagesUtil.addResQuantityToList(gameUser, resources, resourcesList, HexType.WHEAT);
    catan.services.util.play.MessagesUtil.addResQuantityToList(gameUser, resources, resourcesList, HexType.STONE);
    return resourcesList;
}