@java.lang.Override
protected void proceedToTheNextActivity() {
    if (com.quickblox.sample.chat.utils.SharedPreferencesUtil.hasQbUser()) {
        com.quickblox.sample.chat.ui.activity.DialogsActivity.start(this);
    }else {
        com.quickblox.sample.chat.ui.activity.LoginActivity.start(this);
    }
    finish();
}