@java.lang.Override
public void eNotify(org.eclipse.emf.common.notify.Notification notification) {
    de.hub.emffrag2.Fragmentation fFragmentation = fFragmentation();
    if (fFragmentation != null) {
        if ((eResource()) != null) {
            fFragmentation.onChange(notification);
        }
    }
    if ((eBasicHasAdapters()) && (eDeliver())) {
        super.eNotify(notification);
    }
}