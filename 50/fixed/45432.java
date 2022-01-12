public org.smartregister.DristhiConfiguration configuration() {
    if ((configuration) == null) {
        configuration = new org.smartregister.DristhiConfiguration(this.applicationContext().getAssets());
    }
    return configuration;
}