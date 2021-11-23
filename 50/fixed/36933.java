private void validateStateBeforeCommands(ua.mike.opinta.domain.Repository repository) throws ua.mike.opinta.exceptions.MikeException {
    if (!(repository.isInitialized())) {
        repository.initialize();
    }
}