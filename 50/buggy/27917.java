public boolean sendData(Tuple tuple) {
    try {
        sOutput.writeObject(tuple);
        return true;
    } catch (java.io.IOException e) {
        java.lang.System.err.println("Error sending data to client.");
        close();
    }
    return false;
}