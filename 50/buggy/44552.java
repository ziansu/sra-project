private void visitParents(spix.swing.materialEditor.sort.Node node) {
    for (spix.swing.materialEditor.sort.Node parent : node.parents) {
        if (flattenParents.contains(parent)) {
            return ;
        }
        flattenParents.add(parent);
        visitParents(parent);
    }
}