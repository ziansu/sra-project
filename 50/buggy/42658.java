public void record(int frameDelay) {
    cleanUp();
    gifWriter = new mazemaker.io.GifWriter(this, frameDelay);
}