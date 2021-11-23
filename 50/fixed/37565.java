public void close() {
    if (running) {
        util.Log.out("SERVER<ControlThread>: Closed control thread.");
        running = false;
        socRecv.close();
    }
}