public void stop() {
    if ((movieseek) != null) {
        movieseek.stop = true;
        movieseek.interrupt();
        movieseek = null;
    }
}