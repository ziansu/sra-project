private soot.toolkits.exceptions.ThrowableSet registerSetIfNew(java.util.Set<soot.RefLikeType> include, java.util.Set<soot.AnySubType> exclude) {
    if (soot.toolkits.exceptions.ThrowableSet.INSTRUMENTING) {
        (registrationCalls)++;
    }
    soot.toolkits.exceptions.ThrowableSet result = new soot.toolkits.exceptions.ThrowableSet(include, exclude);
    soot.toolkits.exceptions.ThrowableSet ref = registry.get(result);
    if (null != ref) {
        return ref;
    }
    registry.put(result, result);
    return result;
}