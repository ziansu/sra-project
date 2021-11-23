protected void finish() {
    if ((D) instanceof algvis.bst.BST) {
        ((algvis.bst.BST) (D)).setNodeV(null);
    }
    D.scenario.add(new algvis.scenario.EnableButtonsCommand(D.M.B, true));
    D.scenario.endMacro();
}