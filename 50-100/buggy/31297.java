@java.lang.Override
public void run() {
    try {
        load(orchestrator);
    } catch (alien4cloud.exception.AlreadyExistException e) {
        log.info("Orchestrator was already loaded at initialization for {}.", orchestrator.getId());
    } catch (java.lang.Throwable t) {
        log.error("Unexpected error in plugin", t);
        orchestrator.setState(OrchestratorState.DISABLED);
        alienDAO.save(orchestrator);
    }
}