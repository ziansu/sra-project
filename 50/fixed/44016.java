@java.lang.Override
public void manipulate(it.uniroma2.sag.kelp.data.example.Example example) {
    it.uniroma2.sag.kelp.data.representation.tree.TreeRepresentation tree = treeSelector.GetTreeRepresentation(example);
    if (tree != null) {
        manipulateTree(tree, datasetNodeInfo.get(exampleIndex));
        exampleIndex += 1;
    }
}