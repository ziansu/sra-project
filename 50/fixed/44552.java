private void visitParents(spix.swing.materialEditor.sort.Node node) {
    for (spix.swing.materialEditor.sort.Node parent : node.parents) {
        if (flattenParents.contains(parent)) {
            continue;
        }
        flattenParents.add(parent);
        visitParents(parent);
    }
}