public static void afterCreateCollection(org.alfresco.service.cmr.repository.NodeRef collection, org.alfresco.service.cmr.repository.NodeService nodeService) {
    nodeService.setProperty(collection, UCMConstants.PROP_UPLOADER_ALLOWED_TYPES, ((java.io.Serializable) (org.alfresco.museum.ucm.formfilters.UCMCreateCollection.ALLOWED_TYPES)));
}