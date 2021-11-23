protected void clearCurrentSimulation() {
    for (java.lang.String key : simulation.getDvHM().keySet()) {
        if ((simulation.getDvHM().get(key)) instanceof org.lemsml.jlems.viz.datadisplay.StandaloneViewer) {
            org.lemsml.jlems.viz.datadisplay.StandaloneViewer viewer = ((org.lemsml.jlems.viz.datadisplay.StandaloneViewer) (simulation.getDvHM().get(key)));
            viewerRects.put(key, viewer.getViewerRectangle());
            viewer.close();
        }
    }
}