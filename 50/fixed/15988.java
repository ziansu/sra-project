public void destroy() {
    synchronized(this) {
        if ((sc) != null) {
            ol.destroy();
            mgrab.remove();
        }
        release(xl);
        disol(17);
    }
}