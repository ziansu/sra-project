@java.lang.Override
public void removeRelation(org.corpus_tools.salt.graph.Relation<? extends N, ? extends N> relation) {
    super.removeRelation(relation);
    if ((listenerList) != null) {
        org.corpus_tools.salt.extensions.notification.graph.impl.NotifierHelper.notify(listenerList, Listener.NOTIFICATION_TYPE.REMOVE, GRAPH_ATTRIBUTES.LAYER_RELATIONS, relation, null, this);
    }
}