public void destroy() {
    exists = false;
    engine.removeID(getID());
}