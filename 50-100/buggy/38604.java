@java.lang.Override
public void run() {
    initCollapsePanel();
    initToolPanels();
    drawable = org.gephi.visualization.VizController.getInstance().getDrawable();
    engine = org.gephi.visualization.VizController.getInstance().getEngine();
    requestActive();
    add(drawable.getGraphComponent(), java.awt.BorderLayout.CENTER);
    remove(waitingLabel);
    engine.startDisplay();
}