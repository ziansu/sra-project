public static void send(java.io.DataOutputStream out, java.util.logging.Logger logr_debug, net.sf.json.JSONArray sendMsg) {
    try {
        for (int i = 0; i < (sendMsg.size()); i++) {
            out.writeUTF(sendMsg.getJSONObject(i).toString());
        }
        logr_debug.fine(("SENT: " + (sendMsg.toString())));
        out.flush();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}