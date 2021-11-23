public org.smartregister.DristhiConfiguration configuration() {
    if ((configuration) == null) {
        configuration = new org.smartregister.DristhiConfiguration(org.smartregister.Context.getInstance().applicationContext().getAssets());
    }
    return configuration;
}