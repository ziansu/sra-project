@java.lang.Override
public void add(int node) {
    long start = java.lang.System.currentTimeMillis();
    if ((root) == null) {
        treeNodes.Node node1 = new treeNodes.Node();
        node1.setValue(node);
        root = node1;
        (size)++;
    }else {
        add(root, node);
    }
    long time = (java.lang.System.currentTimeMillis()) - start;
    java.lang.System.out.println((((("Время добавления элемента " + node) + " = ") + time) + " мс"));
}