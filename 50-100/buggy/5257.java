public Node nodeAt(int x, int y) {
    java.lang.String s = coordString(x, y);
    if (node_map.containsKey(s)) {
        Node n = node_map.get(s);
        if (((n.getX()) == x) && ((n.getY()) == y))
            return n;
        
    }
    return null;
}