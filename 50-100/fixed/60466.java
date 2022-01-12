private static java.lang.String resourcesToString(catan.domain.model.game.GameUserBean gameUser, catan.domain.model.game.Resources resources) {
    java.lang.String resourcesList = "";
    resourcesList = catan.services.util.play.MessagesUtil.addResQuantityToList(gameUser, resources, resourcesList, HexType.BRICK);
    resourcesList = catan.services.util.play.MessagesUtil.addResQuantityToList(gameUser, resources, resourcesList, HexType.WOOD);
    resourcesList = catan.services.util.play.MessagesUtil.addResQuantityToList(gameUser, resources, resourcesList, HexType.SHEEP);
    resourcesList = catan.services.util.play.MessagesUtil.addResQuantityToList(gameUser, resources, resourcesList, HexType.WHEAT);
    resourcesList = catan.services.util.play.MessagesUtil.addResQuantityToList(gameUser, resources, resourcesList, HexType.STONE);
    return resourcesList;
}