@java.lang.Override
public void eNotify(org.eclipse.emf.common.notify.Notification notification) {
    de.hub.emffrag2.Fragmentation fFragmentation = fFragmentation();
    if ((fFragmentation != null) && (!(((de.hub.emffrag2.Fragment) (eResource())).isLoading()))) {
        fFragmentation.onChange(notification);
    }
    if ((eBasicHasAdapters()) && (eDeliver())) {
        super.eNotify(notification);
    }
}