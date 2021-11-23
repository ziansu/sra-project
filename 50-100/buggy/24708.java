java.util.Set<java.lang.Long> getExpandedFolders() {
    java.util.Set<java.lang.Long> result = new java.util.HashSet<java.lang.Long>();
    for (org.openmicroscopy.shoola.agents.measurement.util.roitable.ROINode node : nodes) {
        if (((node.isExpanded()) && (node.isFolderNode())) && (node.containsROIs()))
            result.add(((omero.gateway.model.FolderData) (node.getUserObject())).getId());
        
    }
    return result;
}