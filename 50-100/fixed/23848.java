@java.lang.Override
public void handleEvent(org.sensorhub.api.common.Event<?> e) {
    if ((e instanceof org.sensorhub.api.module.ModuleEvent) && ((e.getSource()) == (org.sensorhub.impl.service.HttpServer.getInstance()))) {
        org.sensorhub.api.module.ModuleEvent.ModuleState newState = ((org.sensorhub.api.module.ModuleEvent) (e)).getNewState();
        if (newState == (org.sensorhub.api.module.ModuleEvent.ModuleState.STARTED)) {
            try {
                start();
            } catch (java.lang.Throwable ex) {
                reportError("SOS Service could not start", ex);
            }
        }else
            if (newState == (org.sensorhub.api.module.ModuleEvent.ModuleState.STOPPED))
                stop();
            
        
    }
}