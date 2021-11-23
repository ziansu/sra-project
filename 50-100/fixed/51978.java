public void removeUsedItems(generation.TradeNode node, java.util.List<entities.Item> items) {
    for (entities.Item item : node.getReceives()) {
        while (items.contains(item)) {
            items.remove(item);
        } 
    }
    if ((node.getChildren()) == null)
        return ;
    
    for (generation.TradeNode child : node.getChildren()) {
        removeUsedItems(child, items);
    }
}