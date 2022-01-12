@java.lang.Override
public void markResolved(org.jboss.osgi.resolver.XModule module) {
    if (log.isDebugEnabled()) {
        java.lang.StringBuffer buffer = new java.lang.StringBuffer(("Mark resolved: " + module));
        for (org.jboss.osgi.resolver.XWire wire : module.getWires())
            buffer.append(("\n " + (wire.toString())));
        
        log.debugf(buffer.toString());
    }
    resolved.add(module);
}