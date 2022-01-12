public void run() {
    while (!(java.lang.Thread.currentThread().isInterrupted())) {
        while (!(Server.lockSendListRoom.get(id)));
        try {
            java.lang.System.out.println("send!");
            oos.writeObject(Server.listRoom);
            Server.lockSendListRoom.set(id, false);
        } catch (java.io.IOException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    } 
}