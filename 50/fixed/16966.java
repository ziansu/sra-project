@java.lang.Override
public void onClick(android.view.View v) {
    getNewAvatar(true);
    com.mobicage.rogerthat.util.ui.UIUtils.hideKeyboard(getApplicationContext(), newGroupName);
}