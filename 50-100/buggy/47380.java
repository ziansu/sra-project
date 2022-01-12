public java.util.ArrayList getNodeArrayList() {
    javax.swing.tree.TreeModel treeModel = tree.getModel();
    nodeArrayList = new java.util.ArrayList();
    nodeArrayList.add(treeModel.getRoot());
    for (int i = 0; i < (treeModel.getChildCount(rootNode)); i++) {
        nodeArrayList.add(treeModel.getChild(rootNode, i));
    }
    return nodeArrayList;
}