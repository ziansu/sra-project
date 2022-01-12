@java.lang.Override
public final java.lang.Iterable<org.openl.types.IOpenMethod> methods(java.lang.String name) {
    if (allMethodNamesMapInvalidated) {
        synchronized(this) {
            if (allMethodNamesMapInvalidated) {
                allMethodNamesMap = org.openl.types.impl.AOpenClass.buildMethodNameMap(getMethods());
                allMethodNamesMapInvalidated = false;
            }
        }
    }
    java.util.List<org.openl.types.IOpenMethod> found = allMethodNamesMap.get(name);
    return found == null ? java.util.Collections.<org.openl.types.IOpenMethod>emptyList() : java.util.Collections.unmodifiableList(found);
}