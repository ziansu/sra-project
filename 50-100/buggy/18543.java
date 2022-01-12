@java.lang.Override
public void append(final java.lang.String name, final java.lang.Number xValue, final java.lang.Number yValue, final org.eclipse.core.runtime.IProgressMonitor monitor) throws java.lang.Exception {
    if ((this.traceClazz) == (org.eclipse.dawnsci.plotting.api.trace.ILineTrace.class))
        throw new java.lang.Exception("Can only add in 1D mode!");
    
    if ((name == null) || ("".equals(name)))
        throw new java.lang.IllegalArgumentException("The dataset name must not be null or empty string!");
    
    org.dawb.common.ui.util.DisplayUtils.syncExec(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            appendInternal(name, xValue, yValue, monitor);
        }
    });
}