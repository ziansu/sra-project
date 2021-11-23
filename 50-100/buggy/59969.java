private void removed(final org.osgi.framework.ServiceReference<T> ref) {
    final org.apache.felix.http.base.internal.runtime.WhiteboardServiceInfo<T> info = this.allInfos.get(ref.getProperty(Constants.SERVICE_ID));
    if (info != null) {
        this.contextManager.removeWhiteboardService(info);
    }
}