@java.lang.Override
public void Union(int node1Id, int node2Id) {
    nodeIds[Root(node2Id)] = Root(node1Id);
}