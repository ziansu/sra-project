@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    if ((intent == null) || ((intent.getAction()) == null))
        return START_STICKY;
    else
        if (intent.getAction().equals(me.qishen.mockgps.service.MockLocationService.START_MOCK_CMD)) {
            android.util.Log.d(me.qishen.mockgps.service.MockLocationService.TAG, "Start command");
            startMock();
        }else
            if (intent.getAction().equals(me.qishen.mockgps.service.MockLocationService.STOP_MOCK_CMD)) {
                android.util.Log.d(me.qishen.mockgps.service.MockLocationService.TAG, "Stop command");
                stopMock();
            }
        
    
    return START_STICKY;
}