protected java.lang.Void call() throws java.lang.Exception {
    int i;
    for (i = 0; i < 100; i++) {
        client.test();
        java.lang.Thread.sleep(50);
        updateProgress((i++), 100);
        updateMessage((("Loading..." + (i + 1)) + "%"));
    }
    updateMessage("Finish");
    return null;
}