@java.lang.Override
public void handleEvent(final org.cytoscape.view.vizmap.events.VisualStyleAboutToBeRemovedEvent e) {
    if (!(cytoscapeStarted))
        return ;
    
    final org.cytoscape.view.vizmap.VisualStyle vs = e.getVisualStyleToBeRemoved();
    boolean changed = false;
    synchronized(this) {
        changed = visualStyles.remove(vs);
    }
    if (changed && (!(loadingSession)))
        sendNotification(org.cytoscape.view.vizmap.gui.internal.util.NotificationNames.VISUAL_STYLE_REMOVED, vs);
    
}