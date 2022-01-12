@java.lang.Override
public void in(java.lang.String token) {
    messageToken = token;
    l((token + " is in"));
    l(java.lang.String.valueOf(session.getWits().size()));
    if ((session.getWits().size()) < 3) {
        org.json.JSONObject attr = new org.json.JSONObject();
        session.sendTo(localStream, true, attr, token);
    }
}