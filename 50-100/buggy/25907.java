public void removeUsedNPCs(generation.TradeNode node, java.util.List<entities.NPC> npcs) {
    if (node.isTrade()) {
        npcs.remove(node.npc);
    }
    if ((node.getChildren()) == null)
        return ;
    
    for (generation.TradeNode child : node.getChildren()) {
        removeUsedNPCs(child, npcs);
    }
}