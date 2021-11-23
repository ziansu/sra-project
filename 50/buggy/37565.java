public void close() {
    util.Log.out("SERVER<ControlThread>: Closed control thread.");
    if (running) {
        running = false;
        socRecv.close();
    }
}