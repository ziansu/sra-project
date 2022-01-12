public Node nodeAt(int x, int y) {
    java.lang.String s = coordString(x, y);
    if (node_map.containsKey(s)) {
        Node n = node_map.get(s);
        if (((n.x) == x) && ((n.y) == y))
            return n;
        
    }
    return null;
}