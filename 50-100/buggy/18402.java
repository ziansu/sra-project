@java.lang.Override
public void run() {
    java.util.List<java.lang.String> usernames = null;
    try {
        usernames = com.easemob.chat.EMContactManager.getInstance().getContactUserNames();
        isContactsSyncedWithServer = true;
        if (callback != null) {
            callback.onSuccess(usernames);
        }
    } catch (com.easemob.exceptions.EaseMobException e) {
        isContactsSyncedWithServer = false;
        e.printStackTrace();
        if (callback != null) {
            callback.onError(e.getErrorCode(), e.toString());
        }
    }
    isSyncingContactsWithServer = false;
}