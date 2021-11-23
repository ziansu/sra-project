@java.lang.Override
public com.mynanodegreeapps.bakingapp.widget.RemoteViewsFactory onGetViewFactory(android.content.Intent intent) {
    java.lang.System.out.println("--> onGetViewFactory ");
    return new com.mynanodegreeapps.bakingapp.widget.BakingAppRemoteViewFactory(this.getApplicationContext());
}