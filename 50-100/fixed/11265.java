public java.util.Map<java.lang.String, src.Node> updateNodeInMap(src.Node n, java.util.Map<java.lang.String, src.Node> map) {
    src.Node nodeFromMap = map.get(n.getState().toString());
    if ((nodeFromMap.getTotalCost()) > (n.getTotalCost())) {
        map.remove(nodeFromMap.getState().toString());
        map.put(n.getState().toString(), n);
    }
    return map;
}