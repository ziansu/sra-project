@java.lang.Override
public java.lang.Void visit(cons.ql.ast.statement.If ifNode) {
    javax.swing.JPanel container = gui.ComponentCreator.check(ifNode.getBlock(), controller);
    gui.IfObserver ifObserver = new gui.IfObserver(ifNode, controller, container);
    controller.addGlobalObserver(ifObserver);
    pane.add(container);
    return null;
}