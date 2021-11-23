@java.lang.Override
protected org.json.JSONArray doInBackground(java.lang.String... params) {
    org.json.JSONArray queue = null;
    try {
        queue = new ie.tcd.scss.q_dj.ServerComms().getQueue(partyID);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return queue;
}