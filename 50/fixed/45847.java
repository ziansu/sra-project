boolean include(java.lang.String name, boolean isNode) {
    boolean include = false;
    for (opendap.threddsHandler.Filter.Clude clude : _cludes) {
        if (clude.include(name, isNode))
            include = true;
        
    }
    return include;
}