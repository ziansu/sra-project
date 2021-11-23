@java.lang.Override
public boolean requestFocusInWindow() {
    org.geogebra.web.html5.euclidian.EuclidianViewW.actualTabIndex = thisTabIndex;
    g2p.getCanvas().getCanvasElement().focus();
    focusGained();
    return true;
}