public void stand() {
    try {
        output.writeUTF("turn: stand");
    } catch (java.io.IOException ie) {
        ie.printStackTrace();
    }
}