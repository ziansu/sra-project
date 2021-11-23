@java.lang.Override
public void add(int node) {
    if ((root) == null) {
        treeNodes.Node node1 = new treeNodes.Node();
        node1.setValue(node);
        root = node1;
        (size)++;
    }else {
        add(root, node);
    }
}