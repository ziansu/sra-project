@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    super.onReceive(context, intent);
    edu.hm.cs.fs.app.App.getAppComponent(context).inject(this);
}