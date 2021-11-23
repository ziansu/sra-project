public void sendObjectToClient(java.lang.Object object) throws java.io.IOException {
    java.io.ObjectOutputStream serverOutputStream = new java.io.ObjectOutputStream(socket.getOutputStream());
    serverOutputStream.writeObject(((com.eslamhossam23bichoymessiha.projetelim.DataOfLastDay) (object)));
}