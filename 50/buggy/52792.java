public void terminate() throws java.io.IOException {
    updater.done();
    if (isMaster) {
        ibis.registry().terminate();
    }else {
        ibis.registry().waitUntilTerminated();
    }
    terminated = true;
}