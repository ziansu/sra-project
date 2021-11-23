public void setEnabled(java.lang.Boolean enabled) {
    amxBootDelay = 0;
    monitoringDelay = (amxBootDelay) + 5;
    if ((!(this.enabled)) && enabled) {
        this.enabled = enabled;
        bootstrapMonitoringService();
    }else
        if ((this.enabled) && (!enabled)) {
            this.enabled = enabled;
            shutdownMonitoringService();
        }else
            if (this.enabled) {
                this.enabled = enabled;
                shutdownMonitoringService();
                bootstrapMonitoringService();
            }
        
    
}