@org.springframework.web.bind.annotation.RequestMapping(value = "/metadata/versions", method = org.springframework.web.bind.annotation.RequestMethod.GET, produces = org.hisp.dhis.webapi.utils.ContextUtils.CONTENT_TYPE_JSON)
@org.springframework.web.bind.annotation.ResponseBody
public org.hisp.dhis.node.types.RootNode getAllVersion() throws org.hisp.dhis.webapi.controller.exception.MetadataVersionException {
    boolean enabled = isMetadataVersioningEnabled();
    try {
        if (!enabled) {
            throw new org.hisp.dhis.webapi.controller.exception.MetadataVersionException("Metadata versioning is not enabled for this instance.");
        }
        java.util.List<org.hisp.dhis.metadata.version.MetadataVersion> allVersions = versionService.getAllVersions();
        return versionService.getMetadataVersionsAsNode(allVersions);
    } catch (org.hisp.dhis.dxf2.metadata.version.exception.MetadataVersionServiceException ex) {
        throw new org.hisp.dhis.webapi.controller.exception.MetadataVersionException(("Exception occurred while getting all metadata versions. " + (ex.getMessage())));
    }
}