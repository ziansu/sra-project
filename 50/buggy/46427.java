public void stopMove() {
    move_thread.interrupt();
    thread_running = false;
}