@java.lang.Override
public void call(java.lang.Throwable throwable) {
    org.freeshr.interfaces.encounter.ws.EncounterController.logger.error(throwable.getMessage());
    deferredResult.setErrorResult(throwable.getMessage());
}