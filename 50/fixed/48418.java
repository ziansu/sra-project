public void init(android.content.Context context) {
    boolean debug = ((boolean) (com.miguelgaeta.bootstrap.mg_reflection.MGReflection.getBuildConfigValue(context, "DEBUG")));
    timber.log.Timber.plant((debug ? new timber.log.Timber.DebugTree() : new com.miguelgaeta.bootstrap.mg_log.MGLogConfig.ProductionTree()));
}