public void addNode(final NiagarinoOperators node) {
    if (idMap.containsKey(node))
        throw new java.lang.IllegalArgumentException((("node " + node) + " already added"));
    
    idMap.put(node, ((niagaCanvas.niagaCanvas.NiagarinoOperators) (node)).getID());
    edges.put(idMap.get(node), new java.util.BitSet());
    onChange();
}