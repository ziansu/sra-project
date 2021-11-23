public void sendMessage(java.lang.String message, java.io.DataOutputStream dos) throws java.lang.Exception {
    dos.writeUTF((((((Testing3.ClientComm.sender) + ":SEND:") + (Testing3.ClientComm.rcvr)) + ":") + message));
    dos.flush();
    dos.close();
}