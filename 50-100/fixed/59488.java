private void addFullTextFilterDef(org.hibernate.search.annotations.FullTextFilterDef filterDef, java.lang.String filterDefinitionPoint) {
    java.lang.String filterDefinitionName = filterDef.name();
    if (filterDefinitionPoints.containsKey(filterDefinitionName)) {
        if (!(filterDefinitionPoints.get(filterDefinitionName).equals(filterDefinitionPoint))) {
            throw new org.hibernate.search.exception.SearchException(("Multiple filter definitions with the same name: " + (filterDef.name())));
        }
    }else {
        filterDefinitionPoints.put(filterDefinitionName, filterDefinitionPoint);
        addFilterDef(filterDef);
    }
}