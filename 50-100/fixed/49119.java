public void Stats(final java.awt.Font font) {
    try {
        final int nImg = this.GetLock();
        this.Stats(font, nImg, 0);
        usageMap[nImg] = false;
        lock.release();
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}