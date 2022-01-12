public void run() {
    try {
        if ((action) == (railo.runtime.gateway.GatewayThread.START))
            gateway.doStart();
        else
            if ((action) == (railo.runtime.gateway.GatewayThread.STOP))
                gateway.doStop();
            else
                if ((action) == (railo.runtime.gateway.GatewayThread.RESTART))
                    gateway.doRestart();
                
            
        
    } catch (org.opencfml.eventgateway.GatewayException ge) {
        engine.log(gateway, GatewayEngine.LOGLEVEL_ERROR, ge.getMessage());
    }
}