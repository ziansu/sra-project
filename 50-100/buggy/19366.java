@java.lang.Override
protected void flushView() {
    org.cytoscape.event.CyEventHelper eventHelper = adapter.getCyEventHelper();
    eventHelper.flushPayloadEvents();
    if ((myView) != null) {
        org.cytoscape.view.vizmap.VisualStyle vs = createOrGetVisualStyle();
        vs.apply(myView);
        myView.updateView();
    }
}