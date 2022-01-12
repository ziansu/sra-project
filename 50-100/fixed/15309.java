@java.lang.Override
public com.netflix.eureka2.utils.rx.ResourceObservable.ResourceUpdate<com.netflix.eureka2.utils.rx.ResourceObservableTest.ItemUpdate> reload(java.util.Set<com.netflix.eureka2.utils.rx.ResourceObservableTest.ItemUpdate> currentSnapshot) {
    if ((error) != null) {
        throw error;
    }
    java.util.Set<com.netflix.eureka2.utils.rx.ResourceObservableTest.ItemUpdate> newItems = addQueue;
    addQueue = new org.eclipse.jetty.util.ConcurrentHashSet();
    java.util.Set<com.netflix.eureka2.utils.rx.ResourceObservableTest.ItemUpdate> cancelled = removeQueue;
    removeQueue = new org.eclipse.jetty.util.ConcurrentHashSet();
    return new com.netflix.eureka2.utils.rx.ResourceObservable.ResourceUpdate(newItems, cancelled);
}