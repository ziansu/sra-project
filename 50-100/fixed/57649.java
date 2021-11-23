@java.lang.Override
public void startup(eu.w4.engine.core.module.external.ExternalModuleContext emc) throws eu.w4.common.exception.CheckedException, java.rmi.RemoteException {
    eu.w4.contrib.bpmnplus.module.jms.JMSModule.logger.info("Startup JMS module...");
    if (eu.w4.contrib.bpmnplus.module.jms.JMSModule.logger.isDebugEnabled())
        debugModuleClasspath();
    
    module = new eu.w4.contrib.bpmnplus.module.jms.JMSModule.SpringJMSThread(emc.getEngineService());
    module.setContextClassLoader(this.getClass().getClassLoader());
    module.start();
}