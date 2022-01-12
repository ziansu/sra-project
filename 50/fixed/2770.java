public void run() {
    try {
        testingSession.run(iStream);
    } finally {
        processWrapper.allowStreamsClosing();
    }
}