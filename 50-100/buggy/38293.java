@java.lang.Override
public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    loaderItem = menu.findItem(R.id.menu_home_refresh);
    homeController.setLoader(loaderItem);
    if ((loaderItem) != null)
        loaderItem.setActionView(R.layout.action_bar_loading_indicator);
    
    android.view.MenuItem accountSwitcherItem = menu.findItem(R.id.menu_home_account_switcher);
    if (accountSwitcherItem != null) {
        if (org.exoplatform.singleton.ServerSettingHelper.getInstance().twoOrMoreAccountsExist(this))
            accountSwitcherItem.setVisible(true);
        else
            accountSwitcherItem.setVisible(false);
        
    }
    return true;
}