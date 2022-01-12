public boolean evaluatePropertyConstraints(java.util.Collection<java.lang.String> publishedVariableNames) {
    if ((supportedProperties) != null) {
        for (com.whizzosoftware.hobson.api.property.TypedProperty tp : supportedProperties) {
            if (!(tp.evaluateConstraints(publishedVariableNames))) {
                return false;
            }
        }
    }
    return true;
}