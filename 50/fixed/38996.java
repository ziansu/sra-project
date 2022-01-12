@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    mZMQRecvTask = new com.fan.gazeshutter.service.ZMQReceiveTask(this);
    mZMQRecvTask.execute(com.fan.gazeshutter.utils.NetworkUtils.getServerIP());
    return START_STICKY;
}