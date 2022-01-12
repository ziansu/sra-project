@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o)
        return true;
    
    if ((o == null) || ((getClass()) != (o.getClass())))
        return false;
    
    io.gravitee.gateway.services.monitoring.event.Plugin plugin = ((io.gravitee.gateway.services.monitoring.event.Plugin) (o));
    return java.util.Objects.equals(id, plugin.id);
}