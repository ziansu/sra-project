@java.lang.Override
final boolean updateBool() throws java.lang.Exception {
    boolean b = false;
    for (nl.ramondevaan.visualization.core.Source<S> s : inputs) {
        if (s != null) {
            b = b || (s.update());
        }
    }
    if (b || (changed)) {
        try {
            output = nl.ramondevaan.visualization.core.Filter.updateImpl();
            return true;
        } catch (java.lang.Exception e) {
            output = null;
            throw e;
        }
    }
    return false;
}