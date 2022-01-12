public void start(java.lang.String name) {
    try {
        org.json.JSONObject message = new org.json.JSONObject();
        message.put("name", name);
        mSocket.emit("readyToStream", message);
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
    executor.execute(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            configOutput();
        }
    });
}