public void addRelation(dk.itu.jglyph.Glyph better, dk.itu.jglyph.Glyph worse) {
    dk.itu.jglyph.user.Node nodeBetter = nodes.get(better);
    if (nodeBetter == null) {
        nodeBetter = new dk.itu.jglyph.user.Node(better);
        nodes.put(better, nodeBetter);
    }
    dk.itu.jglyph.user.Node nodeWorse = nodes.get(worse);
    if (nodeWorse == null) {
        nodeWorse = new dk.itu.jglyph.user.Node(worse);
        nodes.put(worse, nodeWorse);
    }
    nodeBetter.addChild(nodeWorse);
}