@java.lang.Override
public void onCreate() {
    super.onCreate();
    this.initializeInjector();
    this.initializeLeakDetection();
}