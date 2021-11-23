public void requestNewSender() {
    ServerThread thread = queue.remove();
    thread.setToSender();
}