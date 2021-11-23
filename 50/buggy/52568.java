public void stand() {
    chatbox.append("send stand to server\n");
    try {
        output.writeUTF("turn: stand");
    } catch (java.io.IOException ie) {
        ie.printStackTrace();
    }
}