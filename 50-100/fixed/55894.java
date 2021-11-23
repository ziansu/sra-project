private java.io.ObjectInputStream recieveMassage() throws java.io.IOException {
    ois = new java.io.ObjectInputStream(socket.getInputStream());
    java.lang.String message = null;
    try {
        message = ((java.lang.String) (ois.readObject()));
        java.lang.System.out.println(message);
    } catch (java.lang.ClassNotFoundException e) {
        e.printStackTrace();
    }
    return ois;
}