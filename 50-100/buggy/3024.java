private static void updateStructure(Structure structure, java.util.HashMap<Node, Node> parent, Node plc, Node temp) {
    if ((!(plc.isVisited)) && (!(plc.isWall))) {
        parent.put(plc, temp);
        plc.isVisited = true;
        plc.traveled = (temp.traveled) + 1;
        structure.push(plc);
    }
}