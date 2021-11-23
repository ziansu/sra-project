@java.lang.Override
public void handleEvent(final org.cytoscape.view.vizmap.events.VisualStyleAddedEvent e) {
    if (!(cytoscapeStarted))
        return ;
    
    final org.cytoscape.view.vizmap.VisualStyle vs = e.getVisualStyleAdded();
    boolean changed = false;
    synchronized(this) {
        changed = visualStyles.add(vs);
    }
    if (changed && (!(loadingSession)))
        sendNotification(org.cytoscape.view.vizmap.gui.internal.util.NotificationNames.VISUAL_STYLE_ADDED, vs);
    
}