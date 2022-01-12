public inventory.item.placeableItem.PlaceableMessage canPlace(level.maps.Level level, int x, int y) {
    inventory.item.placeableItem.PlaceableMessage message = super.canPlace(level, x, y);
    if (!(message.canPlace))
        return message;
    
    if (!(level.getTile(x, y).nameId.equals("sandtile")))
        return new inventory.item.placeableItem.PlaceableMessage("notsand");
    
    return new inventory.item.placeableItem.PlaceableMessage("");
}