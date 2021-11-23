private boolean allParentsHaveOrDontHaveParents(final java.util.List<T> parents) {
    assert parents != null;
    assert (parents.size()) > 0;
    final boolean hasParents = parents.get(0).hasParents();
    for (int i = 1; i < (parents.size()); i++)
        if ((parents.get(i).hasParents()) != hasParents)
            return false;
        
    
    return true;
}