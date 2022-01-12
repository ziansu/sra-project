public void removeUsedItems(generation.TradeNode node, java.util.List<entities.Item> items) {
    items.removeAll(node.getReceives());
    if ((node.getChildren()) == null)
        return ;
    
    for (generation.TradeNode child : node.getChildren()) {
        removeUsedItems(child, items);
    }
}