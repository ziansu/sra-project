public void destroyServant() {
    try {
        server.remove(this);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}