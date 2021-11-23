private void lazyLoad() {
    if (!(loaded)) {
        try {
            read();
        } catch (java.lang.RuntimeException e) {
            clear();
            throw e;
        }
    }
}