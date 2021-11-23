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
    if (StockCache.verbose)
        java.lang.System.out.println(("index is: " + index));
    
    if (index < 0) {
        return null;
    }
    java.lang.System.out.println(("index location: " + index));
    return StockCache.instance.stock.get(index);
}