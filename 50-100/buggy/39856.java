public java.lang.String getParentViewName(java.lang.String viewId) {
    java.util.Iterator<java.util.Map.Entry<java.lang.String, java.util.Set<java.lang.String>>> iterator = viewNameParentToViewNameChildsMap.entrySet().iterator();
    while (iterator.hasNext()) {
        java.util.Map.Entry<java.lang.String, java.util.Set<java.lang.String>> parentEntry = iterator.next();
        if (parentEntry.getValue().contains(viewId)) {
            return parentEntry.getKey();
        }
    } 
    return "";
}