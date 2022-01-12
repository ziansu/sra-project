@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    java.lang.String action = intent.getAction();
    switch (action) {
        case com.example.user.onedaynquestions.service.WakefulPushReceiver.ACTION_REGISTRATION :
            abortBroadcast();
            break;
        case com.example.user.onedaynquestions.service.WakefulPushReceiver.ACTION_RECEIVE :
            com.example.user.onedaynquestions.service.WakefulPushReceiver.updated = false;
            onMessageReceived(context, intent);
            com.example.user.onedaynquestions.service.WakefulPushReceiver.updated = true;
            abortBroadcast();
            break;
        case "NEW_PROBLEM_HAS_COME" :
            int check = 0;
            abortBroadcast();
            break;
        default :
            break;
    }
}