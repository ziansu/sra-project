private void close(boolean force) throws java.io.IOException {
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