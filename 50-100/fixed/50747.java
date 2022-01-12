public de.metas.flatrate.model.I_C_Flatrate_Conditions createSubscriptionContract(final de.metas.adempiere.ait.event.AIntegrationTestDriver driver, final de.metas.flatrate.model.I_C_Flatrate_Transition transition) {
    final de.metas.adempiere.ait.helper.GridWindowHelper gridWindowHelper = mkGridWindowHelper();
    final de.metas.flatrate.model.I_C_Flatrate_Conditions conditions = createConditionsCommonBegin(driver, gridWindowHelper, transition);
    final test.integration.contracts.ContractsTestConfig testConfig = getContractsTestConfig();
    conditions.setType_Conditions(X_C_Flatrate_Conditions.TYPE_CONDITIONS_Abonnement);
    createConditionsCommonEnd(driver, gridWindowHelper, conditions, testConfig.getM_Product_Matching_Subcr_Value(), testConfig.getM_Product_Matching_Subcr_IsStocked());
    return conditions;
}