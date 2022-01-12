public void setUnitRemote(final rst.rsb.ScopeType.Scope scope) throws java.lang.InterruptedException, org.openbase.jul.exception.CouldNotPerformException {
    try {
        logger.info(("Setup unit remote: " + (org.openbase.jul.extension.rsb.scope.ScopeGenerator.generateStringRep(scope))));
        RS remote = ((RS) (org.openbase.bco.dal.remote.unit.Units.getUnitByScope(scope, false)));
        remote.activate();
        setRemoteService(remote);
    } catch (org.openbase.jul.exception.CouldNotPerformException ex) {
        throw new org.openbase.jul.exception.CouldNotPerformException("Could not setup unit remote config!", ex);
    }
}