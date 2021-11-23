@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o)
        return true;
    
    if (o == null)
        return false;
    
    if (o instanceof net.osmand.plus.quickaction.QuickAction) {
        net.osmand.plus.quickaction.QuickAction action = ((net.osmand.plus.quickaction.QuickAction) (o));
        if ((type) != (action.type))
            return false;
        
        if ((id) != (action.id))
            return false;
        
        return true;
    }else
        return false;
    
}