public java.util.Set<org.craftercms.studio.api.v1.to.ContentItemTO> getDependantItems(java.lang.String site, java.lang.String path) {
    java.util.Set<org.craftercms.studio.api.v1.to.ContentItemTO> dependents = new java.util.HashSet<>();
    java.util.List<java.lang.String> rawDependentItems = getDependantPaths(site, path);
    for (java.lang.String dependentItem : rawDependentItems) {
        dependents.add(contentService.getContentItem(site, dependentItem));
    }
    return java.util.Collections.unmodifiableSet(dependents);
}