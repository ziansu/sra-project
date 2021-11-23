@org.egov.infra.web.struts.annotation.ValidationErrorPage(value = org.egov.tl.utils.Constants.NEW)
@org.apache.struts2.convention.annotation.Action(value = "/entertradelicense/enterTradeLicense-enterExisting")
public java.lang.String create() {
    try {
        return super.enterExisting(tradeLicense, legacyInstallmentwiseFees);
    } catch (final org.egov.infra.exception.ApplicationRuntimeException e) {
        throw new org.egov.infra.validation.exception.ValidationException("oldLicenseNumber", e.getMessage(), tradeLicense.getOldLicenseNumber());
    }
}