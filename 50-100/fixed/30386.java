public other.Message getMessage() throws java.io.IOException {
    try {
        java.lang.Object obj = inputStream.readObject();
        if (obj instanceof other.Message) {
            return ((other.Message) (obj));
        }else {
            java.lang.System.out.println("Received object is not of type Message");
        }
    } catch (java.lang.ClassNotFoundException | java.io.IOException e) {
        java.lang.System.out.println("Klienten nedkopplad?");
        e.printStackTrace();
        fireDisconnected();
        throw new java.io.IOException();
    }
    return null;
}