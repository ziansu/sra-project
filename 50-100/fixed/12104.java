@java.lang.Override
public void onActionFailure(int action, @android.support.annotation.Nullable
com.tomeokin.lspush.data.model.BaseResponse response, java.lang.String message) {
    if (action == (com.tomeokin.lspush.biz.auth.RegisterFragment.ACTION_CHECK_UID_EXISTED)) {
        if ((response != null) && ((response.getResultCode()) == 10)) {
            mUIDAdapter.info();
            mNotificationBar.showTemporaryInverse(getString(R.string.uid_not_unique));
        }else {
            mNotificationBar.showTemporaryInverse(message);
        }
    }else
        if (action == (com.tomeokin.lspush.biz.auth.RegisterFragment.ACTION_REGISTER)) {
            mNotificationBar.showTemporaryInverse(message);
        }
    
}