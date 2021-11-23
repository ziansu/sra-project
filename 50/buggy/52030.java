@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    super.onStartCommand(intent, flags, startId);
    java.lang.System.out.print("service starting");
    com.mycompany.geotracker.service.DataMovementService.initial(this);
    return START_NOT_STICKY;
}