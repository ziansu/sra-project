public void send(org.json.simple.JSONObject out) {
    try {
        app.getClient().getOutputStream().writeObject(out);
        app.getClient().getOutputStream().flush();
        app.getClient().getOutputStream().reset();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}