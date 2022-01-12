public void requestNewSender() {
    if ((queue.size()) > 0) {
        ServerThread thread = queue.remove();
        thread.setToSender();
    }
}