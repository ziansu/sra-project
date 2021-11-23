public void sendMessage(int id, java.lang.String message) {
    if (((run) && ((flagID) != (-1))) && ((out) != null)) {
        try {
            out.writeByte(id);
            out.writeUTF(message);
            out.flush();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}