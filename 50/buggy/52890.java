@java.lang.Override
public boolean isPortrait() {
    if ((mNavigationManager) instanceof com.dmcapps.navigationfragment.manager.MasterDetailNavigationManagerFragment) {
        return ((com.dmcapps.navigationfragment.manager.MasterDetailNavigationManagerFragment) (mNavigationManager)).isPortrait();
    }else {
        android.util.Log.e("NavigationFragment", "isPortrait() - Navigation Manager must be a MasterDetailNavigationManagerFragment TODO Have all report this.");
        return false;
    }
}