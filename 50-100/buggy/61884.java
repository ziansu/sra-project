public void getShippingDependentData() {
    com.web.foundation.logger.ITSDLogger myLog = com.web.foundation.logger.TSDLogger.getLogger(this.getClass().getName());
    com.web.bf.retail.modules.shoppingcart.ShoppingCartBF shoppingCartBF = new com.web.bf.retail.modules.shoppingcart.ShoppingCartBF();
    myLog.debug(("inside getShippingDependentStates ::: " + (shoppingCartOpr.getRetailOrderRecord().getShippingDetails().getCountryDvo().getCode())));
}