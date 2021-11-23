private void freeEvents() {
    synchronized(touchEventsCopied) {
        for (int i = 0; i < (touchEventsCopied.size()); i++) {
            touchEventPool.free(touchEventsCopied.get(i));
        }
    }
}