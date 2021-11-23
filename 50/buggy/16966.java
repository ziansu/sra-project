@java.lang.Override
public void onClick(android.view.View v) {
    getNewAvatar();
    com.mobicage.rogerthat.util.ui.UIUtils.hideKeyboard(getApplicationContext(), newGroupName);
}