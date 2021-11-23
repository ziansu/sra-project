private void removeListenerInvocation(java.lang.Class<? extends java.lang.annotation.Annotation> annotation, java.lang.Object listener) {
    if (listener == null)
        return ;
    
    java.util.List<L> l = getListenerCollectionForAnnotation(annotation);
    java.util.Set<L> markedForRemoval = new java.util.HashSet<L>(4);
    for (L li : l) {
        if (listener.equals(li.getTarget()))
            markedForRemoval.add(li);
        
    }
    l.removeAll(markedForRemoval);
}