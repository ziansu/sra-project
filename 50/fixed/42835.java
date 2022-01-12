public void beforeRun(com.eviware.soapui.model.testsuite.TestCaseRunner runner, com.eviware.soapui.model.testsuite.TestCaseRunContext context) {
    service = ((com.epam.reportportal.soapui.service.SoapUIService) (context.getProperty(com.epam.reportportal.soapui.listeners.RPProjectRunListener.RP_SERVICE)));
    if (null == (service)) {
        service = com.epam.reportportal.soapui.service.SoapUIService.NOP_SERVICE;
    }
}