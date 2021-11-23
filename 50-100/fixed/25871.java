private void handleReady(org.json.JSONObject json) {
    try {
        lock.lock();
        if (connectedDevices.containsKey(json.getString(PinchInfo.ADDRESS))) {
            connectedDevices.get(json.getString(PinchInfo.ADDRESS)).setReadyReceived(true);
        }
        lock.unlock();
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
}