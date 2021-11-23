private void registerRemoteDevice(android.bluetooth.BluetoothDevice device) {
    boolean addedExpr = false;
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : registeredExpressions.entrySet()) {
        interdroid.swan.crossdevice.swanplus.bluetooth.BTRemoteExpression remoteExpr = new interdroid.swan.crossdevice.swanplus.bluetooth.BTRemoteExpression(entry.getKey(), device, entry.getValue(), interdroid.swan.engine.EvaluationEngineService.ACTION_REGISTER_REMOTE);
        addToQueue(remoteExpr);
        addedExpr = true;
    }
    if (addedExpr && (!(btAdapter.isDiscovering()))) {
        synchronized(evalThread) {
            evalThread.notify();
        }
    }
}