public void sendMessage(java.lang.String message) {
    try {
        if (null == (out)) {
            com.bds.cp.core.util.LogUtil.log(com.bds.cp.core.listener.NetworkCommandListener.class, org.apache.log4j.Level.INFO, "The output stream used to send message is empty.");
        }
        out.writeUTF(message);
    } catch (java.io.IOException ioe) {
        com.bds.cp.core.util.LogUtil.log(com.bds.cp.core.listener.NetworkCommandListener.class, org.apache.log4j.Level.INFO, "Unable to send message to the remote host.");
        ioe.printStackTrace();
    }
}