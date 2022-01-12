public void getShippingDependentData() {
    com.web.foundation.logger.ITSDLogger myLog = com.web.foundation.logger.TSDLogger.getLogger(this.getClass().getName());
    myLog.debug(("inside getShippingDependentStates ::: " + (shoppingCartOpr.getRetailOrderRecord().getShippingDetails().getCountryDvo().getCode())));
}