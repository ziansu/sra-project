@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    switch (position) {
        case 0 :
            showAntiTheftDialog();
            break;
        case 8 :
            callFragment(Constants.SETTINGS_FRAG);
            break;
        case 1 :
            myAdminManager.lookScreen();
            break;
        case 2 :
            myAdminManager.unInstall();
            break;
        default :
            break;
    }
}