@java.lang.Override
public void accept(com.insightfullogic.honest_profiler.core.profiles.Profile profile) {
    try {
        com.insightfullogic.honest_profiler.ports.web.NewProfileMessage newProfile = new com.insightfullogic.honest_profiler.ports.web.NewProfileMessage(machine.getId(), profile);
        java.lang.String message = mapper.writeValueAsString(newProfile);
        clients.sendAll(message);
    } catch (java.lang.Exception e) {
        logger.error(e.getMessage(), e);
    }
}