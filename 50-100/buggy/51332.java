private void leavegameRequest() {
    org.json.JSONObject leavegameobj = new org.json.JSONObject();
    leavegameobj.put("fCall", "leaveGame");
    leavegameobj.put("uid", frontend.LoginPage.uid);
    leavegameobj.put("gid", frontend.LandingPage.gid);
    try {
        frontend.LoginPage.newConnectionThread.messageServer(leavegameobj);
    } catch (java.lang.Exception ex) {
        ex.printStackTrace();
    }
}