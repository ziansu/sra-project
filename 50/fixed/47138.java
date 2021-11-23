public void kill() {
    if ((process) != null) {
        process.destroyForcibly();
    }
}