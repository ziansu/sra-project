public synchronized void sendMessage(java.lang.Object mGameSendDataObject) {
    try {
        if ((mObjectOutputStream) != null) {
            java.lang.System.out.println("Sending message from Server");
            mObjectOutputStream.writeObject(mGameSendDataObject);
            mObjectOutputStream.flush();
        }
    } catch (java.io.IOException ioe) {
        ioe.printStackTrace();
    }
}