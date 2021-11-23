public void stopMove() {
    if (thread_running) {
        move_thread.interrupt();
        thread_running = false;
    }
}