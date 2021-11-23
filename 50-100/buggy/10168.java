@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    android.content.Context mContext = this;
    ru.meefik.linuxdeploy.MainActivity.notification(mContext, null);
    java.lang.String command = intent.getStringExtra("command");
    new ru.meefik.linuxdeploy.ExecScript(getApplicationContext(), command).start();
    return super.onStartCommand(intent, flags, startId);
}