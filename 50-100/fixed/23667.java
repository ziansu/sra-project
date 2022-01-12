public void run() {
    try {
        java.lang.System.out.println("Thread is attempting to create Data Input/Output Streams");
        sInput = new java.io.DataInputStream(socket.getInputStream());
        sOutput = new java.io.DataOutputStream(socket.getOutputStream());
        java.lang.System.out.println(((((userName.toString()) + " ") + (this.id)) + " just connected."));
    } catch (java.io.IOException ex) {
        java.util.logging.Logger.getLogger(ClientThread.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
}