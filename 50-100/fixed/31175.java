@java.lang.Override
public void run() {
    try {
        java.util.List<java.lang.String> usernames = null;
        usernames = com.easemob.chat.EMContactManager.getInstance().getBlackListUsernamesFromServer();
        isBlackListSyncedWithServer = true;
        isSyncingBlackListWithServer = false;
        if (callback != null) {
            callback.onSuccess(usernames);
        }
    } catch (com.easemob.exceptions.EaseMobException e) {
        isBlackListSyncedWithServer = false;
        e.printStackTrace();
        if (callback != null) {
            callback.onError(e.getErrorCode(), e.toString());
        }
    }
}