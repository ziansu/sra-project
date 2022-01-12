@java.lang.Override
public void backgroundProcess() {
    org.apache.tomcat.InstanceManager instanceManager = getInstanceManager();
    if (instanceManager instanceof org.apache.catalina.core.DefaultInstanceManager) {
        try {
            ((org.apache.catalina.core.DefaultInstanceManager) (instanceManager)).backgroundProcess();
        } catch (java.lang.Exception e) {
            org.apache.catalina.core.StandardContext.log.warn(sm.getString("standardContext.backgroundProcess.instanceManager", resources), e);
        }
    }
    super.backgroundProcess();
}