public void saveTPointConfig() {
    try {
        this.TPointConfig.save(this.newConfig_tpoint);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}