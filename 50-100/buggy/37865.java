@java.lang.Override
protected void onSubmit() {
    final java.lang.String addressValue = routerAddress.getModelObject();
    if (("unknown".equals(addressValue)) || (isValidHostAddress(addressValue))) {
        nl.verheulconsultants.monitorisp.service.ISPController.setRouterAddress(addressValue);
        nl.verheulconsultants.monitorisp.ui.HomePage.LOGGER.info("The router address is set to {}", addressValue);
        if (saveSession()) {
            nl.verheulconsultants.monitorisp.ui.HomePage.LOGGER.info("All data are saved.");
        }
    }else {
        error("Wrong router address. Please try again or type unknown");
    }
}