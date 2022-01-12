public void getAllFromNode(java.util.List<code.comp261.ass1.Road> roads) {
    if ((!(isMarked)) || (roads.isEmpty()))
        return ;
    
    roads.addAll(this.roads);
    for (code.comp261.ass1.RoadTrie.RoadTrieNode node : children.values()) {
        node.getAllFromNode(roads);
    }
}