@java.lang.Override
public void windowClosing(java.awt.event.WindowEvent event) {
    for (org.micromanager.display.InspectorPanel panel : panels_) {
        panel.cleanup();
    }
    savePosition();
    org.micromanager.events.internal.DefaultEventManager.getInstance().unregisterForEvents(this);
}