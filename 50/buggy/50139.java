public void save() {
    try {
        cfg.save(getFile());
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}