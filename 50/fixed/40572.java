protected boolean isRecordedSessionSameAsConsumedSession() {
    return (mRecordedSessionId.get()) == (mConsumedSessionId.get());
}