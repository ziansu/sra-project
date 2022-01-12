public org.opencms.ade.publish.CmsPublishRelationFinder.ResourceMap getPublishRelatedResources() {
    org.opencms.ade.publish.CmsPublishRelationFinder.ResourceMap related = computeRelatedResources();
    org.opencms.ade.publish.CmsPublishRelationFinder.ResourceMap reachable = computeReachability(related);
    org.opencms.ade.publish.CmsPublishRelationFinder.ResourceMap publishRelatedResources = getChangedResourcesReachableFromOriginalResources(reachable);
    removeNestedItemsFromTopLevel(publishRelatedResources);
    removeUnchangedTopLevelResources(publishRelatedResources, reachable);
    return publishRelatedResources;
}