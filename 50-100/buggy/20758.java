private static com.exilant.GLEngine.GLAccount getGlAccId(org.egov.commons.CChartOfAccounts glCodeId, java.util.Map glAccountIds) {
    for (java.lang.Object key : glAccountIds.keySet()) {
        if (((java.lang.String) (key)).equalsIgnoreCase(glCodeId.getId().toString()))
            return ((com.exilant.GLEngine.GLAccount) (glAccountIds.get(key)));
        
    }
    return null;
}