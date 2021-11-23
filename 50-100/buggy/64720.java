public stroom.pipeline.destination.RollingDestination borrow(final stroom.util.task.TaskMonitor taskMonitor, final java.lang.Object key, final stroom.pipeline.destination.RollingDestinationFactory destinationFactory) throws java.io.IOException {
    if ((taskMonitor != null) && (taskMonitor.isTerminated())) {
        throw new stroom.pipeline.server.errorhandler.TerminatedException();
    }
    stroom.pipeline.destination.RollingDestination destination = null;
    for (int i = 0; (destination == null) && (i < (stroom.pipeline.destination.RollingDestinations.MAX_TRY_COUNT)); i++) {
        destination = getDestination(taskMonitor, key, destinationFactory);
    }
    return destination;
}