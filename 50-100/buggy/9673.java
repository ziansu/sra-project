@java.lang.Override
public void onDataChange(com.firebase.client.DataSnapshot dataSnapshot) {
    if ((dataSnapshot.getValue()) != null) {
        com.example.chowdi.qremind.infrastructure.QueueInfo queueInfo = dataSnapshot.getValue(com.example.chowdi.qremind.infrastructure.QueueInfo.class);
        if ((queueInfo.getCalling()) != null) {
            if (!(com.example.chowdi.qremind.activities.BaseActivity.notificationPoppedOut))
                popUpNotification(queueNo);
            
            if (!(application.notificationSend))
                application.showNotification();
            
        }
    }else {
        com.example.chowdi.qremind.activities.BaseActivity.fbRefQueueTurn.removeEventListener(com.example.chowdi.qremind.activities.BaseActivity.queueTurnListener);
        com.example.chowdi.qremind.utils.Commons.showToastMessage("You have been removed from queue!", getApplicationContext());
    }
}