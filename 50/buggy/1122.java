private void registerIRightsService() {
    iRightsService = ((sernet.verinice.interfaces.IRightsService) (appCtx.getBean("rightsService")));
    iRightsService.addChangeListener(this);
}