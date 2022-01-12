public java.util.ArrayList<java.awt.Point> backTrace(RaceAI.AI.Node node) {
    java.util.ArrayList<java.awt.Point> path = new java.util.ArrayList<java.awt.Point>();
    path.add(new java.awt.Point(node.x, node.y));
    while (node.parent) {
        node = node.parent;
        path.add(new java.awt.Point(node.x, node.y));
    } 
    java.util.Collections.reverse(path);
    return path;
}