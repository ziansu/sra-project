@java.lang.Override
public com.mynanodegreeapps.bakingapp.widget.RemoteViewsFactory onGetViewFactory(android.content.Intent intent) {
    return new com.mynanodegreeapps.bakingapp.widget.BakingAppRemoteViewFactory(this.getApplicationContext());
}