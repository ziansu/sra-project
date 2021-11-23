@java.lang.Override
public void setQName(java.lang.String qName) {
    java.lang.String oldNamespace = getNamespace();
    java.lang.String oldName = getName();
    super.setNamespace(namespace);
    if ((listenerList) != null) {
        org.corpus_tools.salt.extensions.notification.graph.impl.NotifierHelper.notify(listenerList, Listener.NOTIFICATION_TYPE.SET, GRAPH_ATTRIBUTES.LABEL_NAMESPACE, oldNamespace, getNamespace(), this);
        org.corpus_tools.salt.extensions.notification.graph.impl.NotifierHelper.notify(listenerList, Listener.NOTIFICATION_TYPE.SET, GRAPH_ATTRIBUTES.LABEL_NAME, oldName, getName(), this);
    }
}