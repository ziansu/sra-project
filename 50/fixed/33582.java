private void lazyLoad() {
    if (!(loaded)) {
        loaded = true;
        try {
            read();
        } catch (java.lang.RuntimeException e) {
            clear();
            throw e;
        }
    }
}