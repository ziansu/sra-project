@javax.ws.rs.DELETE
@javax.ws.rs.Path(value = "/{uuid}")
public void deleteConfiguration(@javax.ws.rs.PathParam(value = "uuid")
java.lang.String uuid) throws com.liferay.portal.kernel.exception.PortalException {
    if (!(_permissionChecker.isCompanyAdmin())) {
        throw new javax.ws.rs.ForbiddenException();
    }
    try {
        _configurationHelper.deleteImageAdaptiveMediaConfigurationEntry(_companyId, uuid);
    } catch (java.io.IOException ioe) {
        throw new javax.ws.rs.InternalServerErrorException();
    }
}