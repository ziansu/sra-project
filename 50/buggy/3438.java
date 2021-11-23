public com.nnpcgroup.comd.cosm.entitlement.entity.JvForecastProduction getCurrentProduction() {
    com.nnpcgroup.comd.cosm.entitlement.controller.JvProductionController.log.log(java.util.logging.Level.INFO, "ProductionController::getCurrentProduction returning...", currentProduction);
    if ((currentProduction) == null) {
        currentProduction = productionBean.createInstance();
    }
    return currentProduction;
}