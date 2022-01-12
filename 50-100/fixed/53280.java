private void getCarpool(long remote_id) {
    com.notifica.carpoolnepal.NetworkHandler handler = new com.notifica.carpoolnepal.NetworkHandler(mUsername, mPassword);
    handler.GetAsync((("carpools/" + remote_id) + "/"), new com.notifica.carpoolnepal.Callback() {
        @java.lang.Override
        public void onComplete(java.lang.String response) {
            try {
                org.json.JSONObject carpool = new org.json.JSONObject(response);
                addCarpool(carpool);
            } catch (org.json.JSONException e) {
                e.printStackTrace();
            }
        }
    });
}