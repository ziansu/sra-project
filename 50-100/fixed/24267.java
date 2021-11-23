@java.lang.Override
public void performRequest(org.eclipse.gef.Request request) {
    final org.dbflute.erflute.editor.model.diagram_contents.element.node.ermodel.ERVirtualDiagram model = ((org.dbflute.erflute.editor.model.diagram_contents.element.node.ermodel.ERVirtualDiagram) (this.getModel()));
    final org.dbflute.erflute.editor.model.ERDiagram diagram = this.getDiagram();
    if (request.getType().equals(RequestConstants.REQ_OPEN)) {
        final org.dbflute.erflute.editor.controller.command.ermodel.OpenERModelCommand command = new org.dbflute.erflute.editor.controller.command.ermodel.OpenERModelCommand(diagram, model);
        command.execute();
    }
    super.performRequest(request);
}