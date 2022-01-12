protected static boolean shouldTrace0(java.lang.String option) {
    if (option == null)
        return false;
    
    if ((org.eclipse.ecf.core.util.Trace.TRACEALL) || (org.eclipse.ecf.core.util.Trace.tracePluginsStartsWith(option)))
        return true;
    
    org.eclipse.ecf.internal.core.identity.Activator activator = org.eclipse.ecf.internal.core.identity.Activator.getDefault();
    if (activator == null)
        return false;
    
    org.eclipse.osgi.service.debug.DebugOptions debugOptions = activator.getDebugOptions();
    if (debugOptions == null)
        return false;
    
    java.lang.String result = debugOptions.getOption(option);
    return result == null ? false : result.equalsIgnoreCase("true");
}