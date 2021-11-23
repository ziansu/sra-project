private void handleReady(org.json.JSONObject json) {
    try {
        lock.lock();
        lockStop.lock();
        if ((connectedDevices.containsKey(json.getString(PinchInfo.ADDRESS))) && (!(stop))) {
            lockStop.unlock();
            connectedDevices.get(json.getString(PinchInfo.ADDRESS)).setReadyReceived(true);
        }else {
            lockStop.unlock();
        }
        lock.unlock();
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
}