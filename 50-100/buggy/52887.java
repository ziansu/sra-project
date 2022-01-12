private soot.toolkits.exceptions.ThrowableSet registerSetIfNew(java.util.Set<soot.RefLikeType> include, java.util.Set<soot.AnySubType> exclude) {
    if (soot.toolkits.exceptions.ThrowableSet.INSTRUMENTING) {
        (registrationCalls)++;
    }
    soot.toolkits.exceptions.ThrowableSet result = new soot.toolkits.exceptions.ThrowableSet(include, exclude);
    java.lang.ref.Reference<soot.toolkits.exceptions.ThrowableSet> ref = registry.get(result);
    if (null != ref) {
        soot.toolkits.exceptions.ThrowableSet old = ref.get();
        if (null != old)
            return old;
        
    }
    registry.put(result, new java.lang.ref.WeakReference<soot.toolkits.exceptions.ThrowableSet>(result));
    return result;
}