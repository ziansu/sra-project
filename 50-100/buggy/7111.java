public java.util.Set<D> computeTargets(D source) {
    if (source == (fromValue)) {
        return heros.flowfunc.Transfer.twoElementSet(source, toValue);
    }else
        if (source == (toValue)) {
            return java.util.Collections.emptySet();
        }else {
            return java.util.Collections.singleton(source);
        }
    
}