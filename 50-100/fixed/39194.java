@java.lang.Override
public void onCreate() {
    super.onCreate();
    android.util.Log.d(com.flowcrypt.email.service.EmailSyncService.TAG, "onCreate");
    gmailSynsManager = new com.flowcrypt.email.api.email.sync.GmailSynsManager();
    gmailSynsManager.setSyncListener(this);
    messenger = new android.os.Messenger(new com.flowcrypt.email.service.EmailSyncService.IncomingHandler(this, gmailSynsManager, replyToMessengers));
}