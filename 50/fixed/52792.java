public void terminate() throws java.io.IOException {
    if (isMaster) {
        ibis.registry().terminate();
    }else {
        ibis.registry().waitUntilTerminated();
    }
    updater.done();
    terminated = true;
}