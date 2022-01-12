public java.lang.String recieveMassageFromServer() throws java.io.IOException {
    ois = new java.io.ObjectInputStream(socket.getInputStream());
    java.lang.String message = null;
    try {
        message = ((java.lang.String) (ois.readObject()));
    } catch (java.lang.ClassNotFoundException ex) {
        ex.printStackTrace();
    }
    java.lang.System.out.println(message);
    return message;
}