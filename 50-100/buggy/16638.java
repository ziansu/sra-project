private java.util.ArrayList<cz.packetseekers.behaviour_trees.BTNode> getAllChildren(cz.packetseekers.behaviour_trees.BTNode root, java.util.ArrayList<cz.packetseekers.behaviour_trees.BTNode> nodes) {
    nodes.addAll(root.getChildren());
    for (cz.packetseekers.behaviour_trees.BTNode child : root.getChildren()) {
        nodes.addAll(getAllChildren(child, nodes));
    }
    return nodes;
}