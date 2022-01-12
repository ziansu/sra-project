private void registerIRightsService() {
    if ((iRightsService) == null) {
        iRightsService = ((sernet.verinice.interfaces.IRightsService) (appCtx.getBean("rightsService")));
        iRightsService.addChangeListener(this);
    }
}