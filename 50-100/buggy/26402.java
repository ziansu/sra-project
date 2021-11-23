private void close(boolean force) throws java.io.IOException {
    for (java.io.File file : screenshotPath.listFiles()) {
        file.delete();
    }
    stdin.close();
    stderrin.close();
    if (force) {
        pr.destroy();
    }else {
        command("quit");
        waitFor();
    }
    mplayer.close();
}