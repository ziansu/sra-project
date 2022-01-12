public java.util.Set<D> computeTargets(D source) {
    if (source.equals(fromValue)) {
        return heros.flowfunc.Transfer.twoElementSet(source, toValue);
    }else
        if (source.equals(toValue)) {
            return java.util.Collections.emptySet();
        }else {
            return java.util.Collections.singleton(source);
        }
    
}