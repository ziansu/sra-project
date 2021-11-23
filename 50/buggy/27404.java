@java.lang.Override
public void addNode(N node) {
    super.removeAll();
    if ((listenerList) != null) {
        org.corpus_tools.salt.extensions.notification.graph.impl.NotifierHelper.notify(listenerList, Listener.NOTIFICATION_TYPE.ADD, GRAPH_ATTRIBUTES.LAYER_NODES, null, node, this);
    }
}