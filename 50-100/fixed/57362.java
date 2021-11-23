public void getAllFromNode(java.util.List<code.comp261.ass1.Road> roads) {
    if ((isMarked) && (!(this.roads.isEmpty()))) {
        roads.addAll(this.roads);
    }
    for (code.comp261.ass1.RoadTrie.RoadTrieNode node : children.values()) {
        node.getAllFromNode(roads);
    }
}