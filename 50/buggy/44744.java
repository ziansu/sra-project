private void setDefaultConfiguration() {
    com.jstakun.gms.android.data.FileManager fm = com.jstakun.gms.android.data.PersistenceManagerFactory.getFileManager();
    fm.readResourceBundleFile(com.jstakun.gms.android.config.ConfigurationManager.configuration, R.raw.defaultconfig, getContext());
    fm.createDefaultDirs();
    com.jstakun.gms.android.config.ConfigurationManager.changedConfig.clear();
}