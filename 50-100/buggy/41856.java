protected void startAgs() {
    try {
        if ((envc) != null)
            envc.start();
        
        if ((crtc) != null)
            crtc.start();
        
        for (jade.wrapper.AgentController ag : ags.values()) {
            ag.start();
        }
    } catch (java.lang.Exception e) {
        jason.infra.jade.RunJadeMAS.logger.log(java.util.logging.Level.SEVERE, "Error starting agents.", e);
    }
}