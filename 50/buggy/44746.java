@java.lang.Override
public void addKeyChangeListener(org.eclipse.ice.viz.service.connections.IKeyChangeListener listener) {
    if ((listener != null) && (!(keyListeners.contains(listener)))) {
        keyListeners.add(listener);
    }
}