public void error(java.lang.String error) {
    connecting = false;
    resetForms();
    engine.GlobalData.resetNetwork();
    GlobalData.formManager.getForm("error").isActive = true;
    ((engine.state.FormLabel) (GlobalData.formManager.getForm("error").getComp("text"))).setText(error, (((GlobalData.formManager.getForm("error").width) * 40) - 10));
}