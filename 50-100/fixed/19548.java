@javax.ws.rs.DELETE
@javax.ws.rs.Path(value = "/{id}")
public void deleteConfiguration(@javax.ws.rs.PathParam(value = "id")
java.lang.String id) throws com.liferay.portal.kernel.exception.PortalException {
    if (!(_permissionChecker.isCompanyAdmin())) {
        throw new javax.ws.rs.ForbiddenException();
    }
    try {
        _configurationHelper.deleteImageAdaptiveMediaConfigurationEntry(_companyId, id);
    } catch (java.io.IOException ioe) {
        throw new javax.ws.rs.InternalServerErrorException();
    }
}