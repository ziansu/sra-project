public void setup(java.lang.String version) {
    try {
        this.getClass().newInstance().manage(io.github.bonigarcia.wdm.BrowserManager.DEFAULT_ARCH, version);
    } catch (java.lang.InstantiationException | java.lang.IllegalAccessException e) {
        throw new java.lang.RuntimeException(e);
    }
}