@java.lang.Override
protected org.eclipse.sapphire.modeling.Status compute() {
    org.eclipse.sapphire.modeling.Status retval = org.eclipse.sapphire.modeling.Status.createOkStatus();
    java.lang.String bundleUrl = op().getBundleUrl().content();
    try {
        new org.apache.xerces.util.URI(bundleUrl);
    } catch (java.lang.Exception e) {
    }
    return retval;
}