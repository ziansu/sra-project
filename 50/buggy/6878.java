public void sendToClient(org.json.JSONObject response) {
    java.lang.System.out.println(("Response to client: " + response));
    out.println(response.toString());
    out.flush();
}