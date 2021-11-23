private java.lang.String recieveMassage() throws java.io.IOException {
    ois = new java.io.ObjectInputStream(socket.getInputStream());
    java.lang.String message = null;
    try {
        message = ((java.lang.String) (ois.readObject()));
    } catch (java.lang.ClassNotFoundException e) {
        e.printStackTrace();
    }
    java.lang.System.out.println(("client send: " + message));
    return message;
}