@java.lang.Override
public int levelOf(int a) {
    int index = indexes[(a + 1)];
    return lcaTree.depthOf(index);
}