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
            break;
        case 2 :
            break;
        default :
            break;
    }
}