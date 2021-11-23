public inventory.InventoryItem getRandomFish(java.util.ArrayList<java.lang.Integer> list, java.util.Random random) {
    if ((list.size()) == 0)
        return null;
    
    inventory.item.Item item = level.maps.biomes.ItemData.getItem(list.get(random.nextInt(list.size())));
    return new inventory.InventoryItem(item, getFishAmount(item.nameId, random));
}