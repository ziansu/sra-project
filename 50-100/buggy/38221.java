private void removeListenerInvocation(java.lang.Class<? extends java.lang.annotation.Annotation> annotation, java.lang.Object listener) {
    if (listener == null)
        return ;
    
    java.util.List<L> l = getListenerCollectionForAnnotation(annotation);
    java.util.Set<org.infinispan.notifications.impl.ListenerInvocation> markedForRemoval = new java.util.HashSet<org.infinispan.notifications.impl.ListenerInvocation>(4);
    for (org.infinispan.notifications.impl.ListenerInvocation li : l) {
        if (listener.equals(li.getTarget()))
            markedForRemoval.add(li);
        
    }
    l.removeAll(markedForRemoval);
}