private void adjustAttemptsForConnectionManager() {
    if (shouldSetConnectionManager()) {
        com.android.server.telecom.CreateConnectionProcessor.CallAttemptRecord record = new com.android.server.telecom.CreateConnectionProcessor.CallAttemptRecord(mPhoneAccountRegistrar.getSimCallManager(), mAttemptRecords.get(0).targetPhoneAccount);
        com.android.server.telecom.Log.v(this, "setConnectionManager, changing %s -> %s", mAttemptRecords.get(0), record);
        mAttemptRecords.set(0, record);
    }else {
        com.android.server.telecom.Log.v(this, "setConnectionManager, not changing");
    }
}