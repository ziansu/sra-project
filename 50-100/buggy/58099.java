@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.task.vasskob.googlemaps.app.MyApplication.sMyApplication = this;
    com.raizlabs.android.dbflow.config.FlowManager.init(new com.raizlabs.android.dbflow.config.FlowConfig.Builder(this).addDatabaseConfig(new com.raizlabs.android.dbflow.config.DatabaseConfig.Builder(com.task.vasskob.googlemaps.screens.common.model.db.DbFlowDatabase.class).modelNotifier(com.raizlabs.android.dbflow.runtime.DirectModelNotifier.get()).build()).build());
}