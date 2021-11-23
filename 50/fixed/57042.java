@java.lang.Override
public void onCreate() {
    super.onCreate();
    if (com.squareup.leakcanary.LeakCanary.isInAnalyzerProcess(this))
        return ;
    
    com.squareup.leakcanary.LeakCanary.install(this);
}