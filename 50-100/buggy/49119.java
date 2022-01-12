public void Stats(final java.awt.Font font) {
    try {
        final int nImg = this.GetLock();
        this.Stats(font, nImg);
        usageMap[nImg] = false;
        lock.release();
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}