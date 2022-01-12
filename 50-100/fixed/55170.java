@java.lang.Override
protected void doExecute() {
    if ((walker) instanceof org.dbflute.erflute.editor.model.diagram_contents.element.node.ermodel.WalkerGroup) {
        final org.dbflute.erflute.editor.model.diagram_contents.element.node.ermodel.WalkerGroup group = ((org.dbflute.erflute.editor.model.diagram_contents.element.node.ermodel.WalkerGroup) (walker));
        group.setName("Your Group");
        group.setWalkers(enclosedWalkerList);
    }
    diagram.addNewWalker(walker);
}