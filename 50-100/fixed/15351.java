private boolean isComponentEnabled(net.opengis.swe.v20.DataComponent component) {
    java.lang.String defUri = component.getDefinition();
    if (defUri == null)
        return false;
    
    if ((enabledDefUris) != null) {
        if (!(enabledDefUris.contains(defUri)))
            return false;
        
    }
    return true;
}