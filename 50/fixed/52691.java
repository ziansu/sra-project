private void shutdown() {
    threads.forEach(java.lang.Thread::interrupt);
}