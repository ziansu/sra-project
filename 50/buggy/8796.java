@java.lang.Override
public void run() {
    org.robovm.apple.foundation.NSArray<?> p = new org.robovm.apple.foundation.NSArray(this.photos);
    allAnnotationsMapView.addAnnotations(((org.robovm.apple.foundation.NSArray<org.robovm.apple.foundation.NSObject>) (p)));
    updateVisibleAnnotations();
    loadingStatus.removeFromSuperviewWithFade();
}