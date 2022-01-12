@java.lang.Override
public void startup(eu.w4.engine.core.module.external.ExternalModuleContext emc) throws eu.w4.common.exception.CheckedException, java.rmi.RemoteException {
    eu.w4.contrib.bpmnplus.module.jms.JMSModule.logger.info("Startup JMS module...");
    if (eu.w4.contrib.bpmnplus.module.jms.JMSModule.logger.isDebugEnabled())
        debugModuleClasspath();
    
    eu.w4.contrib.bpmnplus.module.jms.JMSModule.logger.debug("Wait for the engine to be completely started...");
    emc.getEngineService().waitForStartup();
    eu.w4.contrib.bpmnplus.module.jms.JMSModule.logger.debug("\t...engine started.");
    module = new eu.w4.contrib.bpmnplus.module.jms.JMSModule.SpringJMSThread(emc.getEngineService());
    module.setContextClassLoader(this.getClass().getClassLoader());
    module.start();
}