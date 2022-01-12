private java.util.List<org.uengine.essencia.modeling.canvas.ElementView> findCanvasChildElementViewList(java.lang.String[] toEdges) {
    java.util.List<org.uengine.essencia.modeling.canvas.ElementView> canvasChildElementViewList = new java.util.ArrayList<>();
    for (java.lang.String toEdge : toEdges) {
        for (org.uengine.essencia.modeling.canvas.ElementView elementView : getElementViewList()) {
            if (((elementView.getFromEdge()) != null) && (elementView.getFromEdge().contains(toEdge))) {
                canvasChildElementViewList.add(elementView);
            }
        }
    }
    return canvasChildElementViewList;
}