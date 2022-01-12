public void derefer() {
    org.nschmidt.ldparteditor.data.GData.CACHE_warningsAndErrors.remove(this);
    next = null;
    before = null;
}