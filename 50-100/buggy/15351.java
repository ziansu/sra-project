private boolean isComponentEnabled(net.opengis.swe.v20.DataComponent component) {
    java.lang.String defUri = component.getDefinition();
    if (((enabledDefUris) != null) && (defUri != null)) {
        if (!(enabledDefUris.contains(defUri)))
            return false;
        
    }
    return true;
}