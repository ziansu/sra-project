private void appendNode(java.lang.String title, boolean move) {
    GraphicNode new_entry = new GraphicNode(title, 80, 100);
    new_entry.addParent(nodes.get(cursor));
    selectedNode().addChild(new_entry);
    new_entry.setAutoPosition(20);
    nodes.add(new_entry);
    if (move) {
        moveCameraSmooth(new_entry);
        cursor = nodes.indexOf(new_entry);
    }
}