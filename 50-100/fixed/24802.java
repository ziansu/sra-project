public static Item getItem(int itemID) {
    int i = 0;
    int index = -1;
    for (Item itemB : StockCache.instance.stock) {
        if ((itemB.getID()) == itemID) {
            index = i;
            break;
        }
        i++;
    }
    if (index < 0) {
        return null;
    }
    return StockCache.instance.stock.get(index);
}