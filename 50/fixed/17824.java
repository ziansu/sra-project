private int getTitleResId() {
    com.pajato.android.gamechat.common.model.Account account = AccountManager.instance.getCurrentAccount();
    if (account == null)
        return R.string.app_name;
    
    return R.string.GroupsToolbarTitle;
}