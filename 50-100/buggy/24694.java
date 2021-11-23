private com.helpme.app.world.item.IItem[] fixItems(com.helpme.app.saveload.ItemWrapper[] items) {
    com.helpme.app.world.item.IItem[] result = new com.helpme.app.world.item.IItem[items.length];
    for (int i = 0; i < (result.length); i++) {
        result[i] = items[i].getObject();
    }
    return result;
}