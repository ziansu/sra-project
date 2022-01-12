@java.lang.Override
public void onNext(org.spine3.base.Event event) {
    if (projectionRepository.isBulkWriteRequired()) {
        if (!(projectionRepository.isBulkWriteInProgress())) {
            operation = projectionRepository.startBulkWrite(projectionRepository.catchUpMaxDuration);
        }
        operation.checkExpiration();
    }
    projectionRepository.internalDispatch(event);
}