@java.lang.Override
public java.util.List<org.ihtsdo.buildcloud.entity.Product> findAll(final java.lang.String releaseCenterKey, final java.util.Set<org.ihtsdo.buildcloud.service.helper.FilterOption> filterOptions) throws org.ihtsdo.otf.rest.exception.AuthenticationException {
    return productDAO.findAll(filterOptions, org.ihtsdo.buildcloud.service.security.SecurityHelper.getRequiredUser());
}