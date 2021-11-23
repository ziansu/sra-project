private void collectUsedFragmentsInDefinition(java.util.List<java.lang.String> result, java.lang.String fragmentName) {
    if (result.contains(fragmentName))
        return ;
    
    result.add(fragmentName);
    java.util.List<java.lang.String> spreadList = spreadsInDefinition.get(fragmentName);
    if (spreadList == null) {
        return ;
    }
    for (java.lang.String fragment : spreadList) {
        collectUsedFragmentsInDefinition(result, fragment);
    }
}