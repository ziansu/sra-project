@java.lang.Override
public void onCreate() {
    super.onCreate();
    ((io.locative.app.LocativeApplication) (getApplication())).inject(this);
}