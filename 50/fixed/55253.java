public void send(java.io.Serializable serializable) throws java.io.IOException {
    oos.writeObject(serializable);
    oos.flush();
}