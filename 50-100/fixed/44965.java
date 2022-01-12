@java.lang.Override
public void onHandleIntent(android.content.Intent intent) {
    if (intent == null) {
        return ;
    }
    if (org.infobip.mobile.messaging.gcm.MobileMessagingGcmIntentService.ACTION_GCM_MESSAGE_RECEIVE.equals(intent.getAction())) {
        mobileMessageHandler.handleMessage(this, intent);
    }else
        if (org.infobip.mobile.messaging.gcm.MobileMessagingGcmIntentService.ACTION_TOKEN_CLEANUP.equals(intent.getAction())) {
            registrationTokenHandler.handleRegistrationTokenCleanup(this, intent.getStringExtra(org.infobip.mobile.messaging.gcm.MobileMessagingGcmIntentService.EXTRA_GCM_SENDER_ID), intent.getStringExtra(org.infobip.mobile.messaging.gcm.MobileMessagingGcmIntentService.EXTRA_GCM_TOKEN));
        }
    
}