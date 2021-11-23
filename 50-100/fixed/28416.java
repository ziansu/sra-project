@java.lang.Override
protected java.lang.String getTitle(java.util.List<java.lang.String> filters) {
    if (filters.isEmpty())
        return "";
    
    return (filters.size()) > 1 ? ((filters.get(0)) + " +") + ((filters.size()) - 1) : filters.get(0);
}