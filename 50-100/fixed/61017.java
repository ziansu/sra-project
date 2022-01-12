private java.util.List<java.lang.String> convertToObjectNames(java.util.List<net.mindengine.galen.reports.ValidationObject> validationObjects) {
    java.util.List<java.lang.String> names = new java.util.LinkedList<java.lang.String>();
    if (validationObjects != null) {
        for (net.mindengine.galen.reports.ValidationObject validationObject : validationObjects) {
            names.add(validationObject.getName());
        }
    }
    return names;
}