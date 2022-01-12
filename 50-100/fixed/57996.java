private void sendMessage(int id) {
    if (((run) && ((flagID) != (-1))) && ((out) != null)) {
        try {
            out.writeByte(id);
            out.flush();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}