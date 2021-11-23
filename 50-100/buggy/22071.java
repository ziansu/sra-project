private void doCreateMediaShareInLocalMediaShareMapFunction() {
    android.content.Intent operationIntent = new android.content.Intent(com.winsun.fruitmix.util.Util.OPERATION);
    operationIntent.putExtra(Util.OPERATION_TYPE_NAME, OperationType.CREATE.name());
    operationIntent.putExtra(Util.OPERATION_TARGET_TYPE_NAME, OperationTargetType.REMOTE_MEDIASHARE.name());
    for (com.winsun.fruitmix.model.MediaShare mediaShare : LocalCache.LocalMediaShareMapKeyIsUUID.values()) {
        operationIntent.putExtra(Util.OPERATION_MEDIASHARE, mediaShare);
        mManager.sendBroadcast(operationIntent);
    }
}