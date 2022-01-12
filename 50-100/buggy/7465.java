@java.lang.Override
public java.util.List<java.lang.Integer> emit(java.lang.String streamId, java.util.List<java.lang.Object> tuple, java.lang.Object messageId) {
    java.util.List<java.lang.Integer> emitResult = super.emit(streamId, tuple, messageId);
    monitor.startExecute(messageId, null, spoutService);
    return emitResult;
}