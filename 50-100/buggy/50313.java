private void doOpenSession(final org.kie.workbench.common.stunner.core.client.session.ClientSession canvasSession) {
    this.canvasHandler = canvasSession.getCanvasHandler();
    if (null != (canvasHandler.getDiagram())) {
        this.shapeSetId = getShapeSetId(canvasHandler.getDiagram().getMetadata());
        open();
    }
}