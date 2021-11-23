public void sendChangeDiode() throws java.lang.Exception {
    client.sendMessage(light.toString());
    client.close();
}