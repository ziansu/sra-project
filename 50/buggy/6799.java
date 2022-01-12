public synchronized void setActive(java.lang.Boolean n) {
    if (n && (!(active))) {
        reDraw.start();
    }else {
        reDraw.stop();
    }
}