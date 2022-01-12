private java.util.List<T> getFilteredChildren() {
    if ((fFilteredChildren) == null)
        fFilteredChildren = new java.util.ArrayList<T>(getChildren());
    
    return fFilteredChildren;
}