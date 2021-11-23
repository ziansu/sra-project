private java.util.List<T> getFilteredChildren() {
    if ((fFilteredChildren) == null)
        fFilteredChildren = getChildren();
    
    return fFilteredChildren;
}