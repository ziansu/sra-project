private void validateTenant(org.oscm.internal.vo.VOTenant tenant) throws org.oscm.internal.types.exception.WrongTenantConfigurationException {
    if (tenant == null) {
        return ;
    }
    for (org.oscm.internal.types.enumtypes.IdpSettingType idpSettingType : getMandatorySSOSettingKeys()) {
        java.lang.String value = tenant.getTenantSettings().get(idpSettingType);
        if (org.apache.commons.lang3.StringUtils.isBlank(value)) {
            throw new org.oscm.internal.types.exception.WrongTenantConfigurationException((((("Mandatory setting " + (idpSettingType.name())) + " for tenant ") + (tenantID)) + " are missing"));
        }
    }
}