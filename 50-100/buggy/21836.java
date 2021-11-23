@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.oliverbud.android.imagelist.Application.App.context = getApplicationContext();
    objectGraph = dagger.ObjectGraph.create(getModules().toArray());
    objectGraph = objectGraph.plus(new com.oliverbud.android.imagelist.Networking.NetworkModule(), new com.oliverbud.android.imagelist.ImageIdKeeperModule());
    objectGraph.inject(this);
}