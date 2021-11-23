public void setOneFunctionCenterValue() {
    final java.util.List<org.egov.infra.admin.master.entity.AppConfigValues> appConfigValues = appConfigValuesService.getConfigValuesByModuleAndKey(FinancialConstants.MODULE_NAME_APPCONFIG, "ifRestrictedToOneFunctionCenter");
    if ((appConfigValues == null) || (appConfigValues.isEmpty()))
        throw new org.egov.infra.validation.exception.ValidationException("Error", "ifRestrictedToOneFunctionCenter is not defined");
    else
        voucherHeader.setIsRestrictedtoOneFunctionCenter((appConfigValues.get(0).getValue().equalsIgnoreCase("yes") ? true : false));
    
}