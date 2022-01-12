public boolean isChequePrintEnabled() {
    java.lang.String chequePrintEnabled = null;
    final java.util.List<org.egov.infra.admin.master.entity.AppConfigValues> enablePrintConfig = appConfigValuesService.getConfigValuesByModuleAndKey(FinancialConstants.MODULE_NAME_APPCONFIG, "chequeprintingenabled");
    if (enablePrintConfig != null)
        for (final org.egov.infra.admin.master.entity.AppConfigValues appConfigVal : enablePrintConfig)
            chequePrintEnabled = appConfigVal.getValue();
        
    
    if ((chequePrintEnabled != null) && (chequePrintEnabled.equalsIgnoreCase("Y")))
        return true;
    else
        return false;
    
}