private void setDefaultConfiguration() {
    com.jstakun.gms.android.data.PersistenceManagerFactory.getFileManager().createDefaultDirs();
    com.jstakun.gms.android.data.PersistenceManagerFactory.getFileManager().readResourceBundleFile(com.jstakun.gms.android.config.ConfigurationManager.configuration, R.raw.defaultconfig, getContext());
    com.jstakun.gms.android.config.ConfigurationManager.changedConfig.clear();
}