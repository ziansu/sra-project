@java.lang.Override
public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    android.view.MenuItem accountSwitcherItem = menu.findItem(R.id.menu_home_account_switcher);
    if (accountSwitcherItem != null) {
        if (org.exoplatform.singleton.ServerSettingHelper.getInstance().twoOrMoreAccountsExist(this))
            accountSwitcherItem.setVisible(true);
        else
            accountSwitcherItem.setVisible(false);
        
    }
    return true;
}