private boolean writeObject(java.lang.Object o) {
    if (o != null) {
        try {
            outputToServer.reset();
            outputToServer.writeObject(o);
            outputToServer.flush();
        } catch (java.io.IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    return false;
}