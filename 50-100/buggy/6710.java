void addToBoundIntent(android.content.Intent intent, android.app.IServiceConnection connection) {
    com.lody.virtual.server.am.ServiceRecord.IntentBindRecord record = peekBinding(intent);
    if (record == null) {
        record = new com.lody.virtual.server.am.ServiceRecord.IntentBindRecord();
        record.intent = intent;
        synchronized(bindings) {
            android.content.Intent.FilterComparison filter = new android.content.Intent.FilterComparison(intent);
            bindings.put(filter, record);
        }
    }
    record.addConnection(connection);
}