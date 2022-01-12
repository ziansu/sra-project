@java.lang.Override
public void showSelection() {
    if ((this.sourceFigure) == null) {
        this.sourceFigure = getHostFigure();
        this.sourceFigure.addFigureListener(this.figureListener);
    }
    org.talend.core.model.process.INodeConnector connector = new org.talend.designer.core.ui.editor.connections.NodeConnectorTool(nodePart).getConnector();
    if (connector == null) {
        this.setHideHandle(true);
        return ;
    }else {
        this.setHideHandle(false);
    }
    showFeedback(false);
}